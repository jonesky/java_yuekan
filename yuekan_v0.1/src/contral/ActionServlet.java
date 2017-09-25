package contral;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.imple.DaoImplement;
import entry.Goods;
import entry.Member;

/**
 * Servlet implementation class ActionServlet
 */
public class ActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Member m = null;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		DaoImplement mDao=new DaoImplement();
		List<Goods> goods=null;
		String uri = request.getRequestURI();
		String path = uri.substring(uri.lastIndexOf("/")+1, uri.lastIndexOf("."));
		
//		System.out.println(path);
		if(path.equals("login")){
			request.getRequestDispatcher("login").forward(request, response);
		}else if(path.equals("list")){
			m = (Member) request.getSession().getAttribute("member");
			goods = mDao.getAllGoods(m);
			request.getSession().setAttribute("goods", goods);
			request.getRequestDispatcher("/WEB-INF/jsp/list.jsp").forward(request, response);
		}else if(path.equals("index")){
			m = (Member) request.getSession().getAttribute("member");
			goods = mDao.getAllGoods(m);
			request.getSession().setAttribute("goods", goods);
			request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
		}else if(path.equals("delete")){
			System.out.println(request.getParameter("goods_id") + "------" + m);
			mDao.deleteGoods(Integer.parseInt(request.getParameter("goods_id")), Integer.parseInt(m.getxId()));
			request.getRequestDispatcher("list.do").forward(request, response);
		}else if(path.equals("details")){
			m = (Member) request.getSession().getAttribute("member");
			String newGooodsId = request.getParameter("goods_uid");
//			String newGoodsURL = "https://detail.tmall.com/item.htm?spm=a220m.1000858.1000725.5.36b5ffc7JPwWnz&id=" +newGooodsId + "&skuId=3468461846999&user_id=1042138107&cat_id=50025135&is_b=1&rn=8db2ab4476eae98bf5e8f791c5841081";		
			request.setAttribute("goo", mDao.getGoodsIdByGoodsUId(newGooodsId));
			request.getRequestDispatcher("/WEB-INF/jsp/goods3.jsp").forward(request, response);
		}
//		if(path.equals("query")){
//			
//			m = (Member) request.getSession().getAttribute("member");
//			
//			String newGoodsURL = request.getParameter("goodsURL");
//			
//			String patten="&id=(\\d+)&";
//			
//			String newGooodsId = mDao.getSubUtilSimple(newGoodsURL,patten);
//			
//			System.out.println("newGoodsId:" + newGooodsId);
//			
//			String newEvaluateURL = request.getParameter("evaluateURL");
//			
//			mDao.queryGoods(m, newGoodsURL, newEvaluateURL);
//			request.getRequestDispatcher("list.do").forward(request, response);
//		}
//		
		else if(path.equals("query1")){
			
			m = (Member) request.getSession().getAttribute("member");
			
			String newGooodsId = request.getParameter("goodsId");
			
			String newGoodsURL = "https://detail.tmall.com/item.htm?spm=a220m.1000858.1000725.5.36b5ffc7JPwWnz&id=" +newGooodsId + "&skuId=3468461846999&user_id=1042138107&cat_id=50025135&is_b=1&rn=8db2ab4476eae98bf5e8f791c5841081";
			String newEvaluateURL = "https://rate.tmall.com/list_detail_rate.htm?itemId=" + newGooodsId + "&spuId=810293460&sellerId=1042138107&order=3&currentPage=1&append=0&content=1&tagId=&posi=&picture=&ua=090%23qCQXE4XIXIOXPvi0XXXXXQkOIHpyTG9JfQLCI%2BmuAGB2zHP4cnmtGlkp3op9TGZAffLiXXfbC7NK%2BvQXaBVRgoRXXuRkmYDiXXFKMieaRAG3XvXPNHGsVCt24snkXvXuLWQ5HfDW%2F4QXU%2Fd9CeX3rydGSb%2BbC4V3SxqNRcW2r4EDa8d9EVL3ryvnSb%2BbC4V3SajBXvXNLgMFX%2F8HqC%2BH1qmF0oQv%2FJGTzQlgiWPtXvXQsVW8ZzliXXfMhTQ%2F%2BvQXaBVLkoIBXuRRfGliXXwW2MPoDXitGZGsXvXB%2FC0cOIPXKewBgZkt6Q48UulWXvXDehEtidz3oVMhYfD2yEr3Gp10iTT%3D&isg=ApOTxuxlznm4PYJRRLL3YDFKIhd94CZshKEPG0WwKrLgxLJmzRnVWuxWiAJR&needFold=0&_ksTS=1505978673344_2146&callback=jsonp2147";
			
			request.setAttribute("goo", mDao.queryGoods(m, newGoodsURL, newEvaluateURL));
			request.getRequestDispatcher("/WEB-INF/jsp/goods.jsp").forward(request, response);
		}else if(path.equals("query2")){
			
			m = (Member) request.getSession().getAttribute("member");
			
			String newGoodsURL = request.getParameter("goodsURL");
			
			String newEvaluateURL = request.getParameter("evaluateURL");
			
			request.setAttribute("goo", mDao.queryGoods(m, newGoodsURL, newEvaluateURL));
			request.getRequestDispatcher("/WEB-INF/jsp/goods.jsp").forward(request, response);
		}else if(path.equals("query3")){
			
			m = (Member) request.getSession().getAttribute("member");
			
			String newGoodsURL = request.getParameter("goodsURL");
			
			String patten="&id=(\\d+)&";
			
			String gooodsUId = mDao.getSubUtilSimple(newGoodsURL,patten);
			System.out.println("----Uid-----" + gooodsUId);
			String newEvaluateURL = "https://rate.tmall.com/list_detail_rate.htm?itemId=" + gooodsUId + "&spuId=810293460&sellerId=1042138107&order=3&currentPage=1&append=0&content=1&tagId=&posi=&picture=&ua=090%23qCQXE4XIXIOXPvi0XXXXXQkOIHpyTG9JfQLCI%2BmuAGB2zHP4cnmtGlkp3op9TGZAffLiXXfbC7NK%2BvQXaBVRgoRXXuRkmYDiXXFKMieaRAG3XvXPNHGsVCt24snkXvXuLWQ5HfDW%2F4QXU%2Fd9CeX3rydGSb%2BbC4V3SxqNRcW2r4EDa8d9EVL3ryvnSb%2BbC4V3SajBXvXNLgMFX%2F8HqC%2BH1qmF0oQv%2FJGTzQlgiWPtXvXQsVW8ZzliXXfMhTQ%2F%2BvQXaBVLkoIBXuRRfGliXXwW2MPoDXitGZGsXvXB%2FC0cOIPXKewBgZkt6Q48UulWXvXDehEtidz3oVMhYfD2yEr3Gp10iTT%3D&isg=ApOTxuxlznm4PYJRRLL3YDFKIhd94CZshKEPG0WwKrLgxLJmzRnVWuxWiAJR&needFold=0&_ksTS=1505978673344_2146&callback=jsonp2147";
			
			request.setAttribute("goo", mDao.queryGoods(m, newGoodsURL, newEvaluateURL));
			request.getRequestDispatcher("/WEB-INF/jsp/goods.jsp").forward(request, response);
		}else if(path.equals("exit")){
			request.getSession().removeAttribute("member");
			response.sendRedirect("login.do");
		}

	
	}

}
