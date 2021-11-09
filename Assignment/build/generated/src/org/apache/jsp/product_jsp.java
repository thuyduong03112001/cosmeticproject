package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Product Page</title>\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <meta name=\"keywords\" content=\"\" />\n");
      out.write("        <meta name=\"description\" content=\"\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"css/jquery.dualSlider.0.2.css\"/>\n");
      out.write("        <link href=\"css/templatemo_style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/ddsmoothmenu.css\" />\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/ddsmoothmenu.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            ddsmoothmenu.init({\n");
      out.write("                mainmenuid: \"top_nav\",\n");
      out.write("                orientation: \"h\",\n");
      out.write("                classname: \"ddsmoothmenu\",\n");
      out.write("                contentsource: \"markup\"\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <script src=\"js/jquery-1.3.2.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/jquery.easing.1.3.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/jquery.timers-1.2.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/jquery.dualSlider.0.3.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"templatemo_wrapper\">\n");
      out.write("            <div id=\"templatemo_header\">\n");
      out.write("                <div id=\"site_title\">\n");
      out.write("                    <h1><a href=\"#\">Cosmetic by DuongThuy</a></h1>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div id=\"header_right\">\n");
      out.write("                    <ul class=\"navbar-nav m-auto\">\n");
      out.write("                        <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc == null}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                            <li style=\"list-style-type: none;\">\n");
      out.write("                                <a class=\"nav-link\" href=\"Login.jsp\">Đăng Nhập</a>\n");
      out.write("                            </li>\n");
      out.write("                        </c:if>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"cleaner\"></div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"templatemo_menu\">\n");
      out.write("                <div id=\"top_nav\" class=\"ddsmoothmenu\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"home.jsp\">Trang chủ</a></li>\n");
      out.write("                        <li><a href=\"product.jsp\" class=\"selected\">Sản phẩm</a></li>\n");
      out.write("                        <li><a href=\"news.jsp\">Mách bạn</a></li>\n");
      out.write("                        <li><a href=\"checkout.jsp\">Thanh toán</a></li>\n");
      out.write("                        <li><a href=\"contact.jsp\">Liên hệ</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <br style=\"clear: left\" />\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div id=\"menu_second_bar\">\n");
      out.write("                    <div id=\"top_shopping_cart\">\n");
      out.write("                        Giỏ hàng của bạn: (<a href=\"shoppingcart.jsp\">Đến giỏ hàng</a>)\n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"templatemo_search\">\n");
      out.write("                        <form action=\"#\" method=\"get\">\n");
      out.write("                            <input type=\"text\" value=\"Search\" name=\"keyword\" id=\"keyword\" title=\"keyword\" onfocus=\"clearText(this)\" onblur=\"clearText(this)\" class=\"txt_field\"/>\n");
      out.write("                            <input type=\"submit\" name=\"Search\" value=\" Search \" alt=\"Search\" id=\"searchbutton\" title=\"Search\" class=\"sub_btn\"/>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"cleaner\"></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- END of templatemo_menu -->\n");
      out.write("\n");
      out.write("            <div id=\"templatemo_main\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-3\" id=\"sidebar\">\n");
      out.write("                    <div class=\"sidebar_box\">\n");
      out.write("                        <span class=\"bottom\"></span>\n");
      out.write("                        <h3>Danh Mục Sản Phẩm</h3>\n");
      out.write("                        <div class=\"content\">\n");
      out.write("                            <ul class=\"sidebar_list\">\n");
      out.write("                                 <c:set var=\"cid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                                <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.data1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"cat\">\n");
      out.write("                                    <li class=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cat.getCategoryID()==id?\"active\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><a href=\"category?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cat.getCategoryID()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cat.getCategoryName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a></li>\n");
      out.write("                                </c:forEach>       \n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"sidebar_box\">\n");
      out.write("                        <span class=\"bottom\"></span>\n");
      out.write("                        <h3>Sản phẩm bán chạy</h3>\n");
      out.write("                        <div class=\"content\">\n");
      out.write("                            <div class=\"bs_box\">\n");
      out.write("                                <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.data}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"p\">\n");
      out.write("                                    <a href=\"#\"><img class=\"trend\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.images}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></a>\n");
      out.write("                                    <h4><a href=\"#\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getProductName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a></h4>\n");
      out.write("                                    <p class=\"price\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getPrice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                                    <div class=\"cleaner\"></div>\n");
      out.write("                                </c:forEach>\n");
      out.write("                            </div>  \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-9\" id=\"content\">\n");
      out.write("                    <h1>Sản phẩm mới</h1>         \n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.list1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"pa\">\n");
      out.write("                            <div class=\"col-12 col-md-6 col-lg-4\">\n");
      out.write("                                <div class=\"card\">\n");
      out.write("                                    <img class=\"img-product\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pa.images}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <h3 class=\"card-title show_txt\"><a href=\"detail?pid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pa.getProductName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a></h3>\n");
      out.write("                                        <p class=\"product_price\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pa.getPrice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <a href=\"#\" class=\"add_to_card\" style=\"color: #fff\">Thêm giỏ hàng</a>\n");
      out.write("                                                <a href=\"#\" class=\"detail2\">Chi tiết</a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </c:forEach>\n");
      out.write("                    </div>  \n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"cleaner\"></div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"footer\">\n");
      out.write("                <strong>Email:</strong>\n");
      out.write("                <a style=\"color: #d9dadf\" href=\"mailto:duongdthe151367@fpt.edu.vn\">duongdthe151367@fpt.edu.vn</a><br />\n");
      out.write("                <p>Address: Trường Đại học FPT, Hà Nội</p>\n");
      out.write("                <h5>&copy; Copyright 2021. Thuỳ Dương</h5>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
}
