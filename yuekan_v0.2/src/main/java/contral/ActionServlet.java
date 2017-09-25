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
			mDao.deleteGoods(Integer.parseInt(request.getParameter("goods_id")), Integer.parseInt(m.getxId()));
			request.getRequestDispatcher("list.do").forward(request, response);
		}else if(path.equals("details")){
			m = (Member) request.getSession().getAttribute("member");
			String newGooodsId = request.getParameter("goods_uid");
			request.setAttribute("goo", mDao.getGoodsIdByGoodsUId(newGooodsId));
			request.getRequestDispatcher("/WEB-INF/jsp/goods3.jsp").forward(request, response);
		}else if(path.equals("query1")){
			
			m = (Member) request.getSession().getAttribute("member");
			
			String newGooodsId = request.getParameter("goodsId");
			
			
			String newGoodsURL = "https://detail.tmall.com/item.htm?spm=a220m.1000858.1000725.1.6fa7f664yHgWiD&id=" +newGooodsId + "&skuId=3199352041281&areaId=410100&user_id=581746910&cat_id=50025135&is_b=1&rn=1ce380fa94e70647ef10cb838b40a243";
			String newEvaluateURL = "https://rate.tmall.com/list_detail_rate_tab.htm?itemId=" + newGooodsId + "&spuId=689046002&sellerId=581746910&order=3&currentPage=1";
			
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
			String newEvaluateURL = "https://rate.tmall.com/list_detail_rate.htm?itemId=" + gooodsUId + "&spuId=810293460&sellerId=1042138107&order=3&currentPage=1";
			
			request.setAttribute("goo", mDao.queryGoods(m, newGoodsURL, newEvaluateURL));
			request.getRequestDispatcher("/WEB-INF/jsp/goods.jsp").forward(request, response);
		}else if(path.equals("exit")){
			request.getSession().removeAttribute("member");
			response.sendRedirect("login.do");
		}

	
	}

}
