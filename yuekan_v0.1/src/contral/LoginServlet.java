package contral;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.imple.DaoImplement;
import entry.Member;

/**
 * Servlet implementation class LigonServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		DaoImplement mDao=new DaoImplement();
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		String ligonId=request.getParameter("userid");
		String ligonPassword=request.getParameter("password");
		Member m=new Member();
		m.setUserId(ligonId);
		m.setUserPasswd(ligonPassword);
		boolean t = mDao.memberLigon(m);
		if(t){
			request.getSession().setAttribute("member", m);
			request.getRequestDispatcher("index.do").forward(request, response);
//			request.getRequestDispatcher("a.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("login.jsp").forward(request, response);
			System.out.println("error");
		}
		
	}

}
