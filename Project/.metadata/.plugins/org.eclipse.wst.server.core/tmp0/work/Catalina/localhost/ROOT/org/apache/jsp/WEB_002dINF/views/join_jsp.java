/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.65
 * Generated at: 2021-05-12 01:21:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class join_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-4.1.7.RELEASE.jar", Long.valueOf(1620601565867L));
    _jspx_dependants.put("/WEB-INF/views/layout/header.jsp", Long.valueOf(1620614989283L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1620356104582L));
    _jspx_dependants.put("jar:file:/C:/Users/gtlee/Desktop/Project/Project/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/idinoProject/WEB-INF/lib/spring-webmvc-4.1.7.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1435625228000L));
    _jspx_dependants.put("jar:file:/C:/Users/gtlee/Desktop/Project/Project/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/idinoProject/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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
      out.write("\n");
      out.write("\n");
      out.write("\r\n");
      out.write("<!-- jQuery -->\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css\" integrity=\"sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("<!-- common CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/common/css/common.css\">\r\n");
      out.write("\r\n");
      out.write("<title>출석체크 시스템</title>\r\n");
      out.write('\n');
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link rel=\"shortcut icon\" href=\"#\">\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t$(document).on('click','#btnSave',function(e){\n");
      out.write("\t\te.preventDefault();\n");
      out.write("\t\tvar theForm = document.form;\n");
      out.write("\t\tif(theForm.sid.value==\"\"){\n");
      out.write("\t\t\talert(\"학번은 필수입력조건입니다. 입력해주세요\");\n");
      out.write("\t\t\treturn theForm.sid.focus();\n");
      out.write("\t\t}else if (theForm.name.value==\"\" ){\n");
      out.write("\t\t\talert(\"이름은 필수입력조건입니다. 입력해주세요\");\n");
      out.write("\t\t\treturn theForm.name.focus();\n");
      out.write("\t\t}else if (theForm.password.value==\"\"){\n");
      out.write("\t\t\talert(\"비밀번호는 필수입력조건입니다. 입력해주세요\");\n");
      out.write("\t\t\treturn theForm.password.focus();\n");
      out.write("\t\t}else{\n");
      out.write("\t\t\t$(\"#form\").submit();\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\t$(document).on('click','#btnCancle',function(e){\n");
      out.write("\t\te.preventDefault();\n");
      out.write("\t\tlocation.href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/user/login\"\n");
      out.write("\t});\n");
      out.write("</script>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("\n");
      out.write(".cover{\n");
      out.write(" \ttext-align:center;\n");
      out.write("}\n");
      out.write(".menu {\n");
      out.write("  display:inline-block;zoom:1;.display:inline;\n");
      out.write("}\n");
      out.write(".innerbutton{\n");
      out.write("\tpadding : 5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<img src=\"");
      if (_jspx_meth_spring_005furl_005f0(_jspx_page_context))
        return;
      out.write("\">\n");
      out.write("\t\t<h1 class = \"align-center\">회원가입</h1>\t\t \n");
      out.write("\t</div>\n");
      out.write("\t<article>\n");
      out.write("\t\t<div class=\"container\" role=\"main\">\n");
      out.write("\t\t\t<form name=\"form\" id=\"form\" role=\"form\" method=\"post\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/user/saveUserInfo\">\n");
      out.write("\t\t\t\t<div class=\"mb-3\">\n");
      out.write("\t\t\t\t\t<label for=\"sid\">학번(*필수)</label>\n");
      out.write("\t\t\t\t\t<input type=\"number\" class=\"form-control\" name=\"sid\" id=\"sid\" placeholder=\"학번을 입력해 주세요\" required/>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"mb-3\">\n");
      out.write("\t\t\t\t\t<label for=\"name\">이름(*필수)</label>\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"name\" id=\"name\" placeholder=\"이름을 입력해 주세요\" required/>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"mb-3\">\n");
      out.write("\t\t\t\t\t<label for=\"password\">PW(*필수)</label>\n");
      out.write("\t\t\t\t\t<input type = \"password\" class=\"form-control\" name=\"password\" id=\"password\" placeholder=\"비밀번호을 입력해 주세요\" required/>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"mb-3\">\n");
      out.write("\t\t\t\t\t<label for=\"email\">Email</label>\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"email\" id=\"email\" placeholder=\"Email을 입력해 주세요\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"mb-3\">\n");
      out.write("\t\t\t\t\t<label for=\"address\">주소</label>\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"address\" id=\"address\" placeholder=\"주소를 입력해 주세요\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"mb-3\">\n");
      out.write("\t\t\t\t\t<label for=\"phone\">전화번호</label>\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"phone\" id=\"phone\" placeholder=\"핸드폰 번호를 입력해 주세요\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</form>\n");
      out.write("\n");
      out.write("\t\t\t<div class = \"cover\">\n");
      out.write("\t\t\t\t<div class =\"menu\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-sm btn-primary m-1\" id=\"btnSave\">회원가입</button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class =\"menu\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-sm btn-primary m-1\" id=\"btnCancle\">취소</button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</article>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_spring_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f0 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    boolean _jspx_th_spring_005furl_005f0_reused = false;
    try {
      _jspx_th_spring_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_spring_005furl_005f0.setParent(null);
      // /WEB-INF/views/join.jsp(54,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005furl_005f0.setValue("/resources/images/Idino.png");
      int[] _jspx_push_body_count_spring_005furl_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_spring_005furl_005f0 = _jspx_th_spring_005furl_005f0.doStartTag();
        if (_jspx_th_spring_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_005furl_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_005furl_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_005furl_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f0);
      _jspx_th_spring_005furl_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_spring_005furl_005f0, _jsp_getInstanceManager(), _jspx_th_spring_005furl_005f0_reused);
    }
    return false;
  }
}