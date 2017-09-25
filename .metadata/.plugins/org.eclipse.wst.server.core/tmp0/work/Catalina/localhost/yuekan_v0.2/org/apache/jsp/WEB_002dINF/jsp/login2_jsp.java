package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head lang=\"en\">\n");
      out.write("\t<meta charset=UTF-8\">\n");
      out.write("\t<title>Insert title here</title>\n");
      out.write("\t<style type=\"text/css\">\n");
      out.write("        * {\n");
      out.write("            box-sizing: border-box;\n");
      out.write("        }\n");
      out.write("        body {\n");
      out.write("            margin: 0; \n");
      out.write("            padding: 0;\n");
      out.write("            font: 16px/20px microsft yahei;\n");
      out.write("        }\n");
      out.write("        .wrap {\n");
      out.write("            width: 100%;\n");
      out.write("            height: 400px;\n");
      out.write("            padding: 40px 0;\n");
      out.write("            position: fixed;\n");
      out.write("            top: 50%;\n");
      out.write("            margin-top: -200px;\n");
      out.write("            opacity: 0.8;\n");
      out.write("            background: linear-gradient(to bottom right,#50a3a2,#53e3a6);\n");
      out.write("            background: -webkit-linear-gradient(to bottom right,#50a3a2,#53e3a6);\n");
      out.write("        }\n");
      out.write("        .container {\n");
      out.write("            width: 60%;\n");
      out.write("            margin: 0 auto;\n");
      out.write("        }\n");
      out.write("        .container h1 {\n");
      out.write("            text-align: center;\n");
      out.write("            color: #FFFFFF;\n");
      out.write("            font-weight: 500;\n");
      out.write("        }\n");
      out.write("        .container input {\n");
      out.write("            width: 320px;\n");
      out.write("            display: block;\n");
      out.write("            height: 36px;\n");
      out.write("            border: 0;\n");
      out.write("            outline: 0;\n");
      out.write("            padding: 6px 10px;\n");
      out.write("            line-height: 24px;\n");
      out.write("            margin: 32px auto;\n");
      out.write("            -webkit-transition: all 0s ease-in 0.1ms;\n");
      out.write("            -moz-transition: all 0s ease-in 0.1ms;\n");
      out.write("            transition: all 0s ease-in 0.1ms;\n");
      out.write("        }\n");
      out.write("        .container input[type=\"text\"] , .container input[type=\"password\"]  {\n");
      out.write("            background-color: #FFFFFF;\n");
      out.write("            font-size: 16px;\n");
      out.write("            color: #50a3a2;\n");
      out.write("        }\n");
      out.write("        .container input[type='submit'] {\n");
      out.write("            font-size: 16px;\n");
      out.write("            letter-spacing: 2px;\n");
      out.write("            color: #666666;\n");
      out.write("            background-color: #FFFFFF;\n");
      out.write("        }\n");
      out.write("        .container input:focus {\n");
      out.write("            width: 400px;\n");
      out.write("        }\n");
      out.write("        .container input[type='submit']:hover {\n");
      out.write("            cursor: pointer;\n");
      out.write("            width: 400px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .wrap ul {\n");
      out.write("            position: absolute;\n");
      out.write("            top: 0;\n");
      out.write("            left: 0;\n");
      out.write("            width: 100%;\n");
      out.write("            height: 100%;\n");
      out.write("            z-index: -10;\n");
      out.write("        }\n");
      out.write("        .wrap ul li {\n");
      out.write("            list-style-type: none;\n");
      out.write("            display: block;\n");
      out.write("            position: absolute;\n");
      out.write("            bottom: -120px;\n");
      out.write("            width: 15px;\n");
      out.write("            height: 15px;\n");
      out.write("            z-index: -8;\n");
      out.write("            background-color:rgba(255, 255, 255, 0.15);\n");
      out.write("            animotion: square 25s infinite;\n");
      out.write("            -webkit-animation: square 25s infinite;\n");
      out.write("        }\n");
      out.write("        .wrap ul li:nth-child(1) {\n");
      out.write("            left: 0;\n");
      out.write("            animation-duration: 10s;\n");
      out.write("            -moz-animation-duration: 10s;\n");
      out.write("            -o-animation-duration: 10s;\n");
      out.write("            -webkit-animation-duration: 10s;\n");
      out.write("        }\n");
      out.write("        .wrap ul li:nth-child(2) {\n");
      out.write("            width: 40px;\n");
      out.write("            height: 40px;\n");
      out.write("            left: 10%;\n");
      out.write("            animation-duration: 15s;\n");
      out.write("            -moz-animation-duration: 15s;\n");
      out.write("            -o-animation-duration: 15s;\n");
      out.write("            -webkit-animation-duration: 15s;\n");
      out.write("        }\n");
      out.write("        .wrap ul li:nth-child(3) {\n");
      out.write("            left: 20%;\n");
      out.write("            width: 25px;\n");
      out.write("            height: 25px;\n");
      out.write("            animation-duration: 12s;\n");
      out.write("            -moz-animation-duration: 12s;\n");
      out.write("            -o-animation-duration: 12s;\n");
      out.write("            -webkit-animation-duration: 12s;\n");
      out.write("        }\n");
      out.write("        .wrap ul li:nth-child(4) {\n");
      out.write("            width: 50px;\n");
      out.write("            height: 50px;\n");
      out.write("            left: 30%;\n");
      out.write("            -webkit-animation-delay: 3s;\n");
      out.write("            -moz-animation-delay: 3s;\n");
      out.write("            -o-animation-delay: 3s;\n");
      out.write("            animation-delay: 3s;\n");
      out.write("            animation-duration: 12s;\n");
      out.write("            -moz-animation-duration: 12s;\n");
      out.write("            -o-animation-duration: 12s;\n");
      out.write("            -webkit-animation-duration: 12s;\n");
      out.write("        }\n");
      out.write("        .wrap ul li:nth-child(5) {\n");
      out.write("            width: 60px;\n");
      out.write("            height: 60px;\n");
      out.write("            left: 40%;\n");
      out.write("            animation-duration: 10s;\n");
      out.write("            -moz-animation-duration: 10s;\n");
      out.write("            -o-animation-duration: 10s;\n");
      out.write("            -webkit-animation-duration: 10s;\n");
      out.write("        }\n");
      out.write("        .wrap ul li:nth-child(6) {\n");
      out.write("            width: 75px;\n");
      out.write("            height: 75px;\n");
      out.write("            left: 50%;\n");
      out.write("            -webkit-animation-delay: 7s;\n");
      out.write("            -moz-animation-delay: 7s;\n");
      out.write("            -o-animation-delay: 7s;\n");
      out.write("            animation-delay: 7s;\n");
      out.write("        }\n");
      out.write("        .wrap ul li:nth-child(7) {\n");
      out.write("            left: 60%;\n");
      out.write("            animation-duration: 8s;\n");
      out.write("            -moz-animation-duration: 8s;\n");
      out.write("            -o-animation-duration: 8s;\n");
      out.write("            -webkit-animation-duration: 8s;\n");
      out.write("        }\n");
      out.write("        .wrap ul li:nth-child(8) {\n");
      out.write("            width: 90px;\n");
      out.write("            height: 90px;\n");
      out.write("            left: 70%;\n");
      out.write("            -webkit-animation-delay: 4s;\n");
      out.write("            -moz-animation-delay: 4s;\n");
      out.write("            -o-animation-delay: 4s;\n");
      out.write("            animation-delay: 4s;\n");
      out.write("        }\n");
      out.write("        .wrap ul li:nth-child(9) {\n");
      out.write("            width: 100px;\n");
      out.write("            height: 100px;\n");
      out.write("            left: 80%;\n");
      out.write("            animation-duration: 20s;\n");
      out.write("            -moz-animation-duration: 20s;\n");
      out.write("            -o-animation-duration: 20s;\n");
      out.write("            -webkit-animation-duration: 20s;\n");
      out.write("        }\n");
      out.write("        .wrap ul li:nth-child(10) {\n");
      out.write("            width: 120px;\n");
      out.write("            height: 120px;\n");
      out.write("            left: 90%;\n");
      out.write("            -webkit-animation-delay: 6s;\n");
      out.write("            -moz-animation-delay: 6s;\n");
      out.write("            -o-animation-delay: 6s;\n");
      out.write("            animation-delay: 6s;\n");
      out.write("            animation-duration: 30s;\n");
      out.write("            -moz-animation-duration: 30s;\n");
      out.write("            -o-animation-duration: 30s;\n");
      out.write("            -webkit-animation-duration: 30s;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        @keyframes square {\n");
      out.write("            0%  {\n");
      out.write("                    -webkit-transform: translateY(0);\n");
      out.write("                    transform: translateY(0)\n");
      out.write("                }\n");
      out.write("            100% {\n");
      out.write("                    bottom: 400px;\n");
      out.write("                    transform: rotate(600deg);\n");
      out.write("                    -webit-transform: rotate(600deg);\n");
      out.write("                    -webkit-transform: translateY(-500);\n");
      out.write("                    transform: translateY(-500)\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        @-webkit-keyframes square {\n");
      out.write("            0%  {\n");
      out.write("                -webkit-transform: translateY(0);\n");
      out.write("                transform: translateY(0)\n");
      out.write("            }\n");
      out.write("            100% {\n");
      out.write("                bottom: 400px;\n");
      out.write("                transform: rotate(600deg);\n");
      out.write("                -webit-transform: rotate(600deg);\n");
      out.write("                -webkit-transform: translateY(-500);\n");
      out.write("                transform: translateY(-500)\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"wrap\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h1>登陆中心</h1>\n");
      out.write("            <form action=\"login.do\">\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"userid\" placeholder=\"用户名\" />\n");
      out.write("                <input type=\"password\" placeholder=\"密码\" name=\"password\"/>\n");
      out.write("                <input type=\"submit\" value=\"Login\" name=\"submit\"/>\n");
      out.write("\t\t\t</form>\n");
      out.write("        </div>\n");
      out.write("        <ul>\n");
      out.write("            <li></li>\n");
      out.write("            <li></li>\n");
      out.write("            <li></li>\n");
      out.write("            <li></li>\n");
      out.write("            <li></li>\n");
      out.write("            <li></li>\n");
      out.write("            <li></li>\n");
      out.write("            <li></li>\n");
      out.write("            <li></li>\n");
      out.write("            <li></li>\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
