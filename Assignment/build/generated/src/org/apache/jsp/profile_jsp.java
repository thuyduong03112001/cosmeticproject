package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"profileone.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/profile.css\"> \n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta2/css/all.min.css\">\n");
      out.write("        <script src=\"http://code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            function previewFile() {\n");
      out.write("                var preview = document.querySelector('img');\n");
      out.write("                var file = document.querySelector('input[type=file]').files[0];\n");
      out.write("                var reader = new FileReader();\n");
      out.write("\n");
      out.write("                reader.addEventListener(\"load\", function () {\n");
      out.write("                    preview.src = reader.result;\n");
      out.write("                }, false);\n");
      out.write("\n");
      out.write("                if (file) {\n");
      out.write("                    reader.readAsDataURL(file);\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            $(function () {\n");
      out.write("                $('#profile-image1').on('click', function () {\n");
      out.write("                    $('#profile-image-upload').click();\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function viewHistoryOrder() {\n");
      out.write("                window.location.href = \"profile?viewHistory=true\";\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <style>\n");
      out.write("            .profile-pic{\n");
      out.write("                position: absolute;\n");
      out.write("                height:120px;\n");
      out.write("                width:120px;\n");
      out.write("                left: 50%;\n");
      out.write("                transform: translateX(-50%);\n");
      out.write("                top: 0px;\n");
      out.write("                z-index: 1001;\n");
      out.write("                padding: 10px;\n");
      out.write("            }\n");
      out.write("            .profile-pic img{\n");
      out.write("\n");
      out.write("                border-radius: 50%;\n");
      out.write("                box-shadow: 0px 0px 5px 0px #c1c1c1;\n");
      out.write("                cursor: pointer;\n");
      out.write("                width: 100px;\n");
      out.write("                height: 100px;\n");
      out.write("            }  \n");
      out.write("            .profile-badge{\n");
      out.write("                border:1px solid #c1c1c1;\n");
      out.write("                padding:5px;\n");
      out.write("                position: relative;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4 col-md-offset-4 col-sm-6 col-xs-12 profile-badge\">\n");
      out.write("                    <div class=\"profile-pic\">\n");
      out.write("                        <img alt=\"User Pic\" src=\"https://d30y9cdsu7xlg0.cloudfront.net/png/138926-200.png\" id=\"profile-image1\" height=\"200\">\n");
      out.write("                        <input id=\"profile-image-upload\" class=\"hidden\" type=\"file\" onchange=\"previewFile()\" >\n");
      out.write("                        <div style=\"color:#999;\"> </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"mt-3 mb-3\">\n");
      out.write("                        <ul class=\"nav nav-tabs\">\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${viewHistory != null ? \"\" : \"active\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" data-toggle=\"tab\" href=\"#home\">Thông tin cá nhân</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${viewHistory != null ? \"active\" : \"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" data-toggle=\"tab\" href=\"#menu1\"  onclick=\"viewHistoryOrder();\">Lịch sử mua hàng</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("                        <div class=\"tab-content\">\n");
      out.write("                            <div id=\"home\" class=\"container tab-pane ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${viewHistory != null ? \"fade\" : \"active\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><br>\n");
      out.write("                                <h3>Thông tin cá nhân</h3>\n");
      out.write("                                <form action=\"profile\" method=\"post\">\n");
      out.write("                                    <div class=\"form-group info-profile\">\n");
      out.write("                                        <label for=\"usr\">Họ và tên : </label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"txtFullName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentLogin.fullName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group info-profile\">\n");
      out.write("                                        <label for=\"usr\">số điện thoại:</label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"txtPhone\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentLogin.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group info-profile\">\n");
      out.write("                                        <label for=\"usr\">Địa chỉ :</label>\n");
      out.write("                                        <textarea type=\"text\" class=\"form-control\" name=\"txtAddress\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentLogin.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</textarea>\n");
      out.write("                                    </div>\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-sm btn-info\" >Cập nhập</button>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                            <div id=\"menu1\" class=\"container tab-pane  ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${viewHistory != null ? \"active\" : \"fade\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" \"><br>\n");
      out.write("                                <h3>Lịch sử mua hàng</h3>\n");
      out.write("                                <table class=\"table\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>Ngày Mua hàng</th>\n");
      out.write("                                            <th>Tổng tiền</th>\n");
      out.write("                                            <th>Trạng thái</th>\n");
      out.write("                                            <th></th>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("\n");
      out.write("                                    </tbody>\n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listOrder}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("order");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                        <tr>\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.createDate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.totalprice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${order.statusId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                            <td><a class=\"btn btn-sm btn-danger\" href=\"#\">Chi tiết</a></td>\n");
          out.write("                                        </tr>\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
