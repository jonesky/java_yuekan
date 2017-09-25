package dao.imple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import dao.Dao;
import entry.Evaluate;
import entry.Goods;
import entry.Member;
import util.MySqlDBUtil;

public class DaoImplement implements Dao{

	public boolean memberLigon(Member m) {
		Connection conn = null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="SELECT * FROM users WHERE user_id=? AND user_passwd=?";
		
		conn = MySqlDBUtil.getConnection();
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, m.getUserId());
			ps.setString(2, m.getUserPasswd());
			rs = ps.executeQuery();
			
			if(rs.next()){
				m.setxId(Integer.toString(rs.getInt("Id")));
				m.setUserName(rs.getString("user_name"));
				return true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			MySqlDBUtil.close(conn, ps, rs);
		}
		
		
		return false;
	}


	public List<Goods> getAllGoods(Member m) {
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Goods> goods = new ArrayList<Goods>();
		
		String sql = "SELECT * FROM goods WHERE Id in (SELECT goods_id FROM query_log WHERE user_id=?)";
		
		conn = MySqlDBUtil.getConnection();
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, Integer.parseInt(m.getxId()));
			
			rs = ps.executeQuery();
			
			while(rs.next()){
				Goods g = new Goods();
				g.setGoodsId(Integer.toString(rs.getInt("Id")));
				g.setGoogsName(rs.getString("goods_name"));
				g.setGoodsURL(rs.getString("goods_url"));
				g.setGoodsUId(rs.getString("goods_id"));
				g.setGoodsAttribute(rs.getDouble("goods_attribute"));
				
				goods.add(g);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			MySqlDBUtil.close(conn, ps, rs);
		}
			
		return goods;
	}


	public void deleteGoods(int goods_id, int userId) {
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = "DELETE FROM query_log WHERE user_id=? AND goods_id=?";
		
		conn = MySqlDBUtil.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, userId);
			ps.setInt(2, goods_id);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			MySqlDBUtil.close(conn, ps, rs);
		}
		
		
	}
	

	public void addGoogs(Goods goods) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql="INSERT goods(goods_id, goods_name, goods_url, goods_attribute) VALUES(?, ?, ?, ?)";
		
		conn = MySqlDBUtil.getConnection();
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1,goods.getGoodsUId());
			ps.setString(2,goods.getGoogsName());
			ps.setString(3, goods.getGoodsURL());
			ps.setDouble(4, goods.getGoodsAttribute());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			MySqlDBUtil.close(conn, ps, rs);
		}
		
	}


	public void addQueryLog(Member m, int goodsId) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql="INSERT query_log(user_id,goods_id) VALUES(?,?)";
		
		conn = MySqlDBUtil.getConnection();
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, Integer.parseInt(m.getxId()));
			ps.setInt(2, goodsId);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			MySqlDBUtil.close(conn, ps, rs);
		}
		
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void queryEvaluate(String evaluateURL, Goods g) {
		// 访问链接并获取页面内容
		
		String GetPage=sendGet(evaluateURL);
		String regex1="lastPage\":(.*?),\"page\"";
		
		String si = getSubUtilSimple(GetPage,regex1);
		
		while (si == "") {
			GetPage=sendGet(evaluateURL);
			si = getSubUtilSimple(GetPage,regex1);
		}

		int i=Integer.parseInt(si);
		
		
		ExecutorService executor = Executors.newCachedThreadPool();
		
		if(i > 10){
			i = 10;
		}
		
		
		for(int n=1;n<=i;n++){
			executor.execute(new AddUrl(n, evaluateURL, g));
		}
		executor.shutdown();	
		while (!executor.isTerminated()){}
		
	}
	public String sendGet(String url)
	{ // 定义一个字符串用来存储网页内容
		String result = "";
		// 定义一个缓冲字符输入流
		BufferedReader in = null;
		try
		{
			// 将string转成url对象
			URL realUrl = new URL(url);
			// 初始化一个链接到那个url的连接
			URLConnection connection = realUrl.openConnection();
			// 开始实际的连接
			connection.connect();
			// 初始化 BufferedReader输入流来读取URL的响应
			in = new BufferedReader(new InputStreamReader(connection.getInputStream(),"GBK"));
			// 用来临时存储抓取到的每一行的数据
			String line;
			while ((line = in.readLine()) != null)
			{
				// 遍历抓取到的每一行并将其存储到result里面
				result += line;
			}
		} catch (Exception e)
		{
			System.out.println("发送GET请求出现异常！" + e);
			e.printStackTrace();
		} // 使用finally来关闭输入流
		finally
		{
			try
			{
				if (in != null)
				{
					in.close();
				}
			} catch (Exception e2)
			{
				e2.printStackTrace();
			}
		}
		return result;
	}
	public String getSubUtilSimple(String soap,String regex){  
        Pattern pattern = Pattern.compile(regex);// 匹配的模式  
        Matcher m = pattern.matcher(soap);  
        while(m.find()){  
            return m.group(1);  
        }  
        return "";  
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	

	public void addEvaluate(Evaluate ev) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql="INSERT evaluate(goods_id, data, goods_feedback) VALUES(?, ?, ?)";
		conn = MySqlDBUtil.getConnection();
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, Integer.parseInt(ev.getGoodsId()));
			ps.setString(2, ev.getData());
			ps.setDouble(3, ev.getGoodsFeedback());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			MySqlDBUtil.close(conn, ps, rs);
		}
		
	}

	public Goods queryGoods(Member m, String goodsURL, String evaluateURL){
		if(this.getGoodsIdByGoodsURL(goodsURL) == null){
			Goods g = new Goods();
			g = this.getGoods(goodsURL);
			this.addGoogs(g);
			g = this.getGoodsIdByGoodsURL(goodsURL);
			
			//调用方法，利用爬虫将指定URL的商品评价信息抓取出来，并存入数据库中，等待情感分析时python的调用
			this.queryEvaluate(evaluateURL, g);
			
			//java 调用 Python 方法，获得情感分析结果
	        //需传入的参数 string a
	        //设置命令行传入参数  
	        String[] arg = new String[] { "python", "G:/Javaweb/web_work/yuekan/src/feedback.py", g.getGoodsId()};  
	        Process pr;
			try {
				pr = Runtime.getRuntime().exec(arg);
				BufferedReader in = new BufferedReader(new InputStreamReader(pr.getInputStream()));  
		        String line;  

		        if ((line = in.readLine()) != null) {  
//		        	g.setGoodsAttribute(Double.parseDouble(line));
		        }  
		        in.close();  
		        pr.waitFor();  
			} catch (IOException | InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			g.setGoodsAttribute(this.getGoodsAttribute(g.getGoodsId()));
			this.upGoogs(g);
	        //将查询出的商品信息存入到数据库中，包含商品名，商品URL，商品评价值
	      //创建一条查询记录，并将记录存到数据库中
	        this.addQueryLog(m, Integer.parseInt(g.getGoodsId()));
	        return g;
		}else{
			this.addQueryLog(m, Integer.parseInt(this.getGoodsIdByGoodsURL(goodsURL).getGoodsId()));
			return this.getGoodsIdByGoodsURL(goodsURL);
		}
		
	
		
	}

	public void upGoogs(Goods g) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql="UPDATE goods SET goods_attribute=? WHERE Id=?";
		
		conn = MySqlDBUtil.getConnection();
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setDouble(1, g.getGoodsAttribute());
			ps.setInt(2, Integer.parseInt(g.getGoodsId()));
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			MySqlDBUtil.close(conn, ps, rs);
		}
		
	}

	public double getGoodsAttribute(String goodsId) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;	
		String sql = "SELECT AVG(goods_feedback) FROM evaluate WHERE goods_id=?";
		
		conn = MySqlDBUtil.getConnection();
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, Integer.parseInt(goodsId));
			
			rs = ps.executeQuery();
			
			while(rs.next()){
				return rs.getDouble(1);	
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			MySqlDBUtil.close(conn, ps, rs);
		}
		return 0;
	}

	public Goods getGoods(String goodsURL) {
		Goods g = new Goods();
		g.setGoodsURL(goodsURL);
		
		String patten="&id=(\\d+)&";
		
		String gooodsUId = this.getSubUtilSimple(goodsURL,patten);
		
		g.setGoodsUId(gooodsUId);
		
		Document doc = null;
		try {
			doc = Jsoup.connect(goodsURL).get();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Elements eles = doc.select("title");
		for(Element e : eles){
			String str = e.text();
			String goodsName = str.trim();
			Pattern pattern = Pattern.compile("(.*)-tmall.com天猫");
			Matcher matcher = pattern.matcher(goodsName);
			if(matcher.find()){
				g.setGoogsName(matcher.group(1));
				return g;
			}		
		}
		//通过URL利用爬虫工具获取商品信息，并返回Goods对象，对象内必须包含被查询出的商品ID
		return null;
	}

	@Override
	public Goods getGoodsIdByGoodsURL(String GoodsURL) {
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql="SELECT * FROM goods WHERE goods_url=?";
		
		conn = MySqlDBUtil.getConnection();
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, GoodsURL);
			rs = ps.executeQuery();
			
			if(rs.next()){
				Goods g = new Goods();
				g.setGoodsId(Integer.toString(rs.getInt("Id")));
				g.setGoodsAttribute(rs.getDouble("goods_attribute"));
				g.setGoodsUId(rs.getString("goods_id"));
				g.setGoodsURL(rs.getString("goods_url"));
				g.setGoogsName(rs.getString("goods_name"));
				return g;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			MySqlDBUtil.close(conn, ps, rs);
		}
		return null;
	}

	public Goods getGoodsIdByGoodsUId(String newGooodsId) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql="SELECT * FROM goods WHERE goods_id=?";
		
		conn = MySqlDBUtil.getConnection();
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, newGooodsId);
			rs = ps.executeQuery();
			
			if(rs.next()){
				Goods g = new Goods();
				g.setGoodsId(Integer.toString(rs.getInt("Id")));
				g.setGoodsAttribute(rs.getDouble("goods_attribute"));
				g.setGoodsUId(rs.getString("goods_id"));
				g.setGoodsURL(rs.getString("goods_url"));
				g.setGoogsName(rs.getString("goods_name"));
				return g;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			MySqlDBUtil.close(conn, ps, rs);
		}
		return null;
	}

	
}
