/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.63
 * Generated at: 2021-05-26 08:06:25 UTC
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
    _jspx_dependants.put("jar:file:/C:/Users/gtlee/Desktop/Project/Project/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/idinoProject/WEB-INF/lib/standard-1.1.2.jar!/META-INF/c.tld", Long.valueOf(1098678690000L));
    _jspx_dependants.put("/WEB-INF/views/layout/header.jsp", Long.valueOf(1621986213056L));
    _jspx_dependants.put("jar:file:/C:/Users/gtlee/Desktop/Project/Project/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/idinoProject/WEB-INF/lib/spring-webmvc-4.1.7.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1435625228000L));
    _jspx_dependants.put("/WEB-INF/lib/standard-1.1.2.jar", Long.valueOf(1621985746039L));
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- jQuery -->\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- common CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/common/css/common.css\">\r\n");
      out.write("\r\n");
      out.write("<title>출석체크 시스템</title>\r\n");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"#\">\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(document).on('click','#btnSave',function(e){\r\n");
      out.write("\t\te.preventDefault();\r\n");
      out.write("\t\tvar theForm = document.form;\r\n");
      out.write("\t\tif(theForm.sid.value==\"\"){\r\n");
      out.write("\t\t\talert(\"학번은 필수입력조건입니다. 입력해주세요\");\r\n");
      out.write("\t\t\treturn theForm.sid.focus();\r\n");
      out.write("\t\t}else if (theForm.name.value==\"\" ){\r\n");
      out.write("\t\t\talert(\"이름은 필수입력조건입니다. 입력해주세요\");\r\n");
      out.write("\t\t\treturn theForm.name.focus();\r\n");
      out.write("\t\t}else if (theForm.password.value==\"\"){\r\n");
      out.write("\t\t\talert(\"비밀번호는 필수입력조건입니다. 입력해주세요\");\r\n");
      out.write("\t\t\treturn theForm.password.focus();\r\n");
      out.write("\t\t}else if (theForm.position.value==\"\"){\r\n");
      out.write("\t\t\talert(\"직급는 필수입력조건입니다. 선택해주세요\");\r\n");
      out.write("\t\t\treturn theForm.position.focus();\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\t$(\"#form\").submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t$(document).on('click','#btnCancle',function(e){\r\n");
      out.write("\t\te.preventDefault();\r\n");
      out.write("\t\tlocation.href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/user/login\"\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write(".cover{\r\n");
      out.write(" \ttext-align:center;\r\n");
      out.write("}\r\n");
      out.write(".menu {\r\n");
      out.write("  display:inline-block;zoom:1;.display:inline;\r\n");
      out.write("}\r\n");
      out.write(".innerbutton{\r\n");
      out.write("\tpadding : 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<img src=\"");
      if (_jspx_meth_spring_005furl_005f0(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("\t\t<h1 class = \"align-center\">회원가입</h1>\t\t \r\n");
      out.write("\t</div>\r\n");
      out.write("\t<article>\r\n");
      out.write("\t\t<div class=\"container\" role=\"main\">\r\n");
      out.write("\t\t\t<form name=\"form\" id=\"form\" role=\"form\" method=\"post\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/user/saveUserInfo\">\r\n");
      out.write("\t\t\t\t<div class=\"mb-3\">\r\n");
      out.write("\t\t\t\t\t<label for=\"sid\">학번(사번)(*필수)</label>\r\n");
      out.write("\t\t\t\t\t<input type=\"number\" class=\"form-control\" name=\"sid\" id=\"sid\" placeholder=\"학번을 입력해 주세요\" required/>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"mb-3\">\r\n");
      out.write("\t\t\t\t\t<label for=\"name\">이름(*필수)</label>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"name\" id=\"name\" placeholder=\"이름을 입력해 주세요\" required/>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"mb-3\">\r\n");
      out.write("\t\t\t\t\t<label for=\"password\">PW(*필수)</label>\r\n");
      out.write("\t\t\t\t\t<input type = \"password\" class=\"form-control\" name=\"password\" id=\"password\" placeholder=\"비밀번호을 입력해 주세요\" required/>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"mb-3\">\r\n");
      out.write("\t\t\t\t\t<label for=\"email\">Email</label>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"email\" id=\"email\" placeholder=\"Email을 입력해 주세요\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"mb-3\">\r\n");
      out.write("\t\t\t\t\t<label for=\"address\">주소</label>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"address\" id=\"address\" placeholder=\"주소를 입력해 주세요\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"mb-3\">\r\n");
      out.write("\t\t\t\t\t<label for=\"phone\">전화번호</label>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"phone\" id=\"phone\" placeholder=\"핸드폰 번호를 입력해 주세요\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"cover\">\r\n");
      out.write("\t\t\t\t   <!-- radio는 동일한 속성으로 갈라면 name이 같아야한다. -->\r\n");
      out.write("\t\t\t\t   <!-- check :  사용자가 누르기전에 체크되어 있는 속성 -->\r\n");
      out.write("\t\t\t\t   <input type=\"radio\" id=\"position\" name=\"position\" value=\"관리자\">관리자     \r\n");
      out.write("\t\t\t\t   <input type=\"radio\" id=\"position\" name=\"position\" value=\"학생\">학생\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class = \"cover\">\r\n");
      out.write("\t\t\t\t<div class =\"menu\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-sm btn-primary m-1\" id=\"btnSave\">회원가입</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class =\"menu\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-sm btn-primary m-1\" id=\"btnCancle\">취소</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</article>\r\n");
      out.write("</body>\r\n");
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
      // /WEB-INF/views/join.jsp(57,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
