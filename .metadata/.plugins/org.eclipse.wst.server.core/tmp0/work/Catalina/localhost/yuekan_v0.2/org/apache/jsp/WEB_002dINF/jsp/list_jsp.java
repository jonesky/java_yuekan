package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>list</title>\n");
      out.write("\t<style type=\"text/css\">\n");
      out.write("\t\ttable.hovertable {\n");
      out.write("\t\t\tfont-family: verdana,arial,sans-serif;\n");
      out.write("\t\t\tfont-size:11px;\n");
      out.write("\t\t\tcolor:#333333;\n");
      out.write("\t\t\tborder-width: 1px;\n");
      out.write("\t\t\tborder-color: #999999;\n");
      out.write("\t\t\tborder-collapse: collapse;\n");
      out.write("\t\t}\n");
      out.write("\t\ttable.hovertable th {\n");
      out.write("\t\t\tbackground-color:#c3dde0;\n");
      out.write("\t\t\tborder-width: 1px;\n");
      out.write("\t\t\tpadding: 8px;\n");
      out.write("\t\t\tborder-style: solid;\n");
      out.write("\t\t\tborder-color: #a9c6c9;\n");
      out.write("\t\t}\n");
      out.write("\t\ttable.hovertable tr {\n");
      out.write("\t\t\tbackground-color:#d4e3e5;\n");
      out.write("\t\t}\n");
      out.write("\t\ttable.hovertable td {\n");
      out.write("\t\t\tborder-width: 1px;\n");
      out.write("\t\t\tpadding: 8px;\n");
      out.write("\t\t\tborder-style: solid;\n");
      out.write("\t\t\tborder-color: #a9c6c9;\n");
      out.write("\t\t}\n");
      out.write("\t</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<div><p align=\"right\">用户：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member.userName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("  </p></div><div align=\"right\"><a href=\"index.do\" >返回</a></div>\n");
      out.write("\t<br>\n");
      out.write("\t<h3 align=\"center\">历史查询信息</h3>\n");
      out.write("\t<table border=\"1\" align=\"center\" class=\"hovertable\">\n");
      out.write("\t\t<tr onmouseover=\"this.style.backgroundColor='#ffff66';\" onmouseout=\"this.style.backgroundColor='#d4e3e5';\">\n");
      out.write("\t\t\t<th>商品号</th>\n");
      out.write("\t\t\t<th align=\"center\">商品信息</th>\n");
      out.write("\t\t\t<th>操作</th>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\t\n");
      out.write("\t</table>\n");
      out.write("\t\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/jsp/list.jsp(48,2) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/list.jsp(48,2) '${goods}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${goods}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /WEB-INF/jsp/list.jsp(48,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("b");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("\t\t\t<tr onmouseover=\"this.style.backgroundColor='#ffff66';\" onmouseout=\"this.style.backgroundColor='#d4e3e5';\">\n");
            out.write("\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${b.goodsUId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("</td>\n");
            out.write("\t\t\t\t<td>\n");
            out.write("\t\t\t\t\t<div style=\"word-break:break-all\"><p>商品名:&nbsp;&nbsp;&nbsp;");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${b.googsName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("</p></div>\n");
            out.write("\t\t\t\t\t<div style=\"word-break:break-all\"><p>URL:&nbsp;&nbsp;&nbsp;<a href=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${b.goodsURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write('"');
            out.write('>');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${b.goodsURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("</a></p></div>\n");
            out.write("\t\t\t\t\t<div style=\"word-break:break-all\"><p>商品评价值:&nbsp;&nbsp;&nbsp;");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${b.goodsAttribute}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("</p></div>\n");
            out.write("\t\t\t\t</td>\n");
            out.write("\t\t\t\t<td>\n");
            out.write("\t\t\t\t\t<div style=\"white-space:nowrap\"><a href=\"details.do?goods_uid=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${b.goodsUId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("\">详情</a></div>\n");
            out.write("\t\t\t\t\t<br>\n");
            out.write("\t\t\t\t\t<div style=\"white-space:nowrap\"><a href=\"delete.do?goods_id=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${b.goodsId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("\">删除</a></div>\n");
            out.write("\t\t\t\t</td>\n");
            out.write("\t\t\t</tr>\n");
            out.write("\t\t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
    } finally {
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
