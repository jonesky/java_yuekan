package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"zh\" class=\"no-js\">\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta charset=\"UTF-8\" />\n");
      out.write("\t\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"> \n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"> \n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\" />\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\" />\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      if (_jspx_meth_c_005furl_005f2(_jspx_page_context))
        return;
      out.write("\" />\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      if (_jspx_meth_c_005furl_005f3(_jspx_page_context))
        return;
      out.write("\" />\n");
      out.write("\t\t<script src=\"");
      if (_jspx_meth_c_005furl_005f4(_jspx_page_context))
        return;
      out.write("\" ></script>\n");
      out.write("\t\t<style type=\"text/css\">\n");
      out.write("\t\t\t.a{\n");
      out.write("\t\t\t\tdisplay: block;\n");
      out.write("\t\t\t\tmargin-top: 2.5em;\n");
      out.write("\t\t\t\tpadding: 1.5em;\n");
      out.write("\t\t\t\twidth: 100%;\n");
      out.write("\t\t\t\tborder: none;\n");
      out.write("\t\t\t\tbackground: #e75854;\n");
      out.write("\t\t\t\tcolor: #f9f6e5;\n");
      out.write("\t\t\t\ttext-transform: uppercase;\n");
      out.write("\t\t\t\tletter-spacing: 1px;\n");
      out.write("\t\t\t\tfont-weight: 800;\n");
      out.write("\t\t\t\tfont-size: 1.25em;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t</style>\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<header class=\"codrops-header\">\n");
      out.write("\t\t\t\t<h1>阅 看 商 品 查 询 系 统</h1>\n");
      out.write("\t\t\t\t<p>欢迎使用 阅看商品查询系统 本系统由 胡亚洲 刘鹏搏 尹博亚 共同开发完成</p>\n");
      out.write("\t\t\t\t<nav class=\"codrops-demos\">\n");
      out.write("\t\t\t\t\t<hr/>\n");
      out.write("\t\t\t\t</nav>\n");
      out.write("\t\t\t</header>\n");
      out.write("\t\t\t<div align=\"center\">用户: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member.userName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href=\"list.do\" >我的查询</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href=\"exit.do\" >退出</a></div>\n");
      out.write("\t\t\t<section>\n");
      out.write("\t\t\t\t<p>我们为更好的 <strong>商品购买</strong> 提供服务</p>\n");
      out.write("\t\t\t\t<div class=\"mockup-content\">\n");
      out.write("\t\t\t\t\t<div class=\"morph-button morph-button-modal morph-button-modal-2 morph-button-fixed\">\n");
      out.write("\t\t\t\t\t\t<button type=\"button\">商品号</button>\n");
      out.write("\t\t\t\t\t\t<div class=\"morph-content\">\n");
      out.write("\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"content-style-form content-style-form-1\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"icon icon-close\">Close the dialog</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2>商品号查询</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t<form action=\"query1.do\" method=\"post\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p><label>商品号</label><input type=\"text\" name=\"goodsId\"/></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p><input type=\"submit\" class=\"a\" name=\"submit\" value=\"查询 \"/></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div><!-- morph-button -->\n");
      out.write("\t\t\t\t\t<!-- <strong class=\"joiner\">or</strong> -->\n");
      out.write("\t\t\t\t\t<div class=\"morph-button morph-button-modal morph-button-modal-3 morph-button-fixed\">\n");
      out.write("\t\t\t\t\t\t<button type=\"button\">商品URL</button>\n");
      out.write("\t\t\t\t\t\t<div class=\"morph-content\">\n");
      out.write("\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"content-style-form content-style-form-2\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"icon icon-close\">Close the dialog</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2>商品URL查询</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t<form action=\"query3.do\" method=\"POST\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p><label>商品URL</label><input type=\"text\" name=\"goodsURL\"/></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p><input type=\"submit\" class=\"a\" name=\"submit\" value=\"查询 \"/></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div><!-- morph-button -->\n");
      out.write("\t\t\t\t\t<!-- <strong class=\"joiner\">or</strong> -->\n");
      out.write("\t\t\t\t\t<div class=\"morph-button morph-button-modal morph-button-modal-3 morph-button-fixed\">\n");
      out.write("\t\t\t\t\t\t<button type=\"button\">详细URL</button>\n");
      out.write("\t\t\t\t\t\t<div class=\"morph-content\">\n");
      out.write("\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"content-style-form content-style-form-2\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"icon icon-close\">Close the dialog</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2>URL查询</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t<form action=\"query2.do\" method=\"POST\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p><label>商品URL</label><input type=\"text\" name=\"goodsURL\"/></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p><label>评论URL</label><input type=\"text\" name=\"evaluateURL\"/></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p><input type=\"submit\" class=\"a\" name=\"submit\" value=\"查询 \"/></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div><!-- morph-button -->\n");
      out.write("\t\t\t\t\t<p>Kohlrabi radish okra azuki bean corn fava bean mustard tigernut juccama green bean celtuce collard greens avocado quandong.</p>\n");
      out.write("\t\t\t\t</div><!-- /form-mockup -->\n");
      out.write("\t\t\t</section>\n");
      out.write("\t\t</div><!-- /container -->\n");
      out.write("\t\t<script src=\"");
      if (_jspx_meth_c_005furl_005f5(_jspx_page_context))
        return;
      out.write("\" ></script>\n");
      out.write("\t\t<script src=\"");
      if (_jspx_meth_c_005furl_005f6(_jspx_page_context))
        return;
      out.write("\" ></script>\n");
      out.write("\t\t<script>\n");
      out.write("\t\t\t(function() {\n");
      out.write("\t\t\t\tvar docElem = window.document.documentElement, didScroll, scrollPosition;\n");
      out.write("\n");
      out.write("\t\t\t\t// trick to prevent scrolling when opening/closing button\n");
      out.write("\t\t\t\tfunction noScrollFn() {\n");
      out.write("\t\t\t\t\twindow.scrollTo( scrollPosition ? scrollPosition.x : 0, scrollPosition ? scrollPosition.y : 0 );\n");
      out.write("\t\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t\tfunction noScroll() {\n");
      out.write("\t\t\t\t\twindow.removeEventListener( 'scroll', scrollHandler );\n");
      out.write("\t\t\t\t\twindow.addEventListener( 'scroll', noScrollFn );\n");
      out.write("\t\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t\tfunction scrollFn() {\n");
      out.write("\t\t\t\t\twindow.addEventListener( 'scroll', scrollHandler );\n");
      out.write("\t\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t\tfunction canScroll() {\n");
      out.write("\t\t\t\t\twindow.removeEventListener( 'scroll', noScrollFn );\n");
      out.write("\t\t\t\t\tscrollFn();\n");
      out.write("\t\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t\tfunction scrollHandler() {\n");
      out.write("\t\t\t\t\tif( !didScroll ) {\n");
      out.write("\t\t\t\t\t\tdidScroll = true;\n");
      out.write("\t\t\t\t\t\tsetTimeout( function() { scrollPage(); }, 60 );\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t};\n");
      out.write("\n");
      out.write("\t\t\t\tfunction scrollPage() {\n");
      out.write("\t\t\t\t\tscrollPosition = { x : window.pageXOffset || docElem.scrollLeft, y : window.pageYOffset || docElem.scrollTop };\n");
      out.write("\t\t\t\t\tdidScroll = false;\n");
      out.write("\t\t\t\t};\n");
      out.write("\n");
      out.write("\t\t\t\tscrollFn();\n");
      out.write("\n");
      out.write("\t\t\t\t[].slice.call( document.querySelectorAll( '.morph-button' ) ).forEach( function( bttn ) {\n");
      out.write("\t\t\t\t\tnew UIMorphingButton( bttn, {\n");
      out.write("\t\t\t\t\t\tcloseEl : '.icon-close',\n");
      out.write("\t\t\t\t\t\tonBeforeOpen : function() {\n");
      out.write("\t\t\t\t\t\t\t// don't allow to scroll\n");
      out.write("\t\t\t\t\t\t\tnoScroll();\n");
      out.write("\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\tonAfterOpen : function() {\n");
      out.write("\t\t\t\t\t\t\t// can scroll again\n");
      out.write("\t\t\t\t\t\t\tcanScroll();\n");
      out.write("\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\tonBeforeClose : function() {\n");
      out.write("\t\t\t\t\t\t\t// don't allow to scroll\n");
      out.write("\t\t\t\t\t\t\tnoScroll();\n");
      out.write("\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\tonAfterClose : function() {\n");
      out.write("\t\t\t\t\t\t\t// can scroll again\n");
      out.write("\t\t\t\t\t\t\tcanScroll();\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t} );\n");
      out.write("\t\t\t\t} );\n");
      out.write("\n");
      out.write("\t\t\t\t// for demo purposes only\n");
      out.write("\t\t\t\t[].slice.call( document.querySelectorAll( 'form button' ) ).forEach( function( bttn ) { \n");
      out.write("\t\t\t\t\tbttn.addEventListener( 'click', function( ev ) { ev.preventDefault(); } );\n");
      out.write("\t\t\t\t} );\n");
      out.write("\t\t\t})();\n");
      out.write("\t\t</script>\n");
      out.write("\t</body>\n");
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

  private boolean _jspx_meth_c_005furl_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    try {
      _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f0.setParent(null);
      // /WEB-INF/index.jsp(10,47) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setValue("/css/normalize.css");
      int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
      if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    try {
      _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f1.setParent(null);
      // /WEB-INF/index.jsp(11,47) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f1.setValue("/css/demo.css");
      int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
      if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    try {
      _jspx_th_c_005furl_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f2.setParent(null);
      // /WEB-INF/index.jsp(12,47) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f2.setValue("/css/component.css");
      int _jspx_eval_c_005furl_005f2 = _jspx_th_c_005furl_005f2.doStartTag();
      if (_jspx_th_c_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    try {
      _jspx_th_c_005furl_005f3.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f3.setParent(null);
      // /WEB-INF/index.jsp(13,47) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f3.setValue("/css/content.css");
      int _jspx_eval_c_005furl_005f3 = _jspx_th_c_005furl_005f3.doStartTag();
      if (_jspx_th_c_005furl_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    try {
      _jspx_th_c_005furl_005f4.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f4.setParent(null);
      // /WEB-INF/index.jsp(14,15) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f4.setValue("/js/modernizr.custom.js");
      int _jspx_eval_c_005furl_005f4 = _jspx_th_c_005furl_005f4.doStartTag();
      if (_jspx_th_c_005furl_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f4);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f5 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    try {
      _jspx_th_c_005furl_005f5.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f5.setParent(null);
      // /WEB-INF/index.jsp(99,15) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f5.setValue("/js/classie.js");
      int _jspx_eval_c_005furl_005f5 = _jspx_th_c_005furl_005f5.doStartTag();
      if (_jspx_th_c_005furl_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f5);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f6 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    try {
      _jspx_th_c_005furl_005f6.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f6.setParent(null);
      // /WEB-INF/index.jsp(100,15) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f6.setValue("/js/uiMorphingButton_fixed.js");
      int _jspx_eval_c_005furl_005f6 = _jspx_th_c_005furl_005f6.doStartTag();
      if (_jspx_th_c_005furl_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } finally {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f6);
    }
    return false;
  }
}
