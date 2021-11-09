package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
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
      out.write("                        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"cleaner\"></div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"templatemo_menu\">\n");
      out.write("                <div id=\"top_nav\" class=\"ddsmoothmenu\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"home\">Trang chủ</a></li>\n");
      out.write("                        <li><a href=\"product\">Sản phẩm</a></li>\n");
      out.write("                        <li><a href=\"news\">Mách bạn</a></li>\n");
      out.write("                        <li><a href=\"checkout\">Thanh toán</a></li>\n");
      out.write("                        <li><a href=\"contact\" class=\"selected\">Liên hệ</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <br style=\"clear: left\" />\n");
      out.write("                </div>\n");
      out.write("                <div id=\"menu_second_bar\">\n");
      out.write("                    <div id=\"top_shopping_cart\">\n");
      out.write("                        Giỏ hàng của bạn: (<a href=\"shoppingcart\">Đến giỏ hàng</a>)\n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"templatemo_search\">\n");
      out.write("                        <form action=\"#\" method=\"get\">\n");
      out.write("                            <input type=\"text\" value=\"\" name=\"keyword\" id=\"keyword\" title=\"keyword\" onfocus=\"clearText(this)\" onblur=\"clearText(this)\" class=\"txt_field\"/>\n");
      out.write("                            <input type=\"submit\"  name=\"Tìm kiếm\" value=\" Tìm kiếm \" alt=\"Search\" id=\"searchbutton\" title=\"Search\" class=\"sub_btn\"/>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"cleaner\"></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div id=\"templatemo_main\">\n");
      out.write("                <div id=\"sidebar\" class=\"float_l\">\n");
      out.write("                    <div class=\"sidebar_box\">\n");
      out.write("                        <span class=\"bottom\" style=\"width:250px\"></span>\n");
      out.write("                        <h3>Danh Mục Sản Phẩm</h3>\n");
      out.write("                        <div class=\"content\">                            \n");
      out.write("                            <ul class=\"sidebar_list\">                               \n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("   \n");
      out.write("                            </ul>  \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"sidebar_box\">\n");
      out.write("                        <span class=\"bottom\" style=\"width:250px\"></span>\n");
      out.write("                        <h3>Sản phẩm bán chạy</h3>\n");
      out.write("                        <div class=\"content\">\n");
      out.write("                            <div class=\"bs_box\">\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </div>  \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"content\" class=\"float_r\">\n");
      out.write("                    <h1> Liên hệ chúng tôi</h1>\n");
      out.write("                    <div class=\"content_half float_l\">\n");
      out.write("                        <h4>Thông tin...</h4>\n");
      out.write("                        <p>\n");
      out.write("                            Vui lòng điền đầy đủ thông tin vào<br>chỗ trống bên dưới trước khi gửi!\n");
      out.write("                        </p>\n");
      out.write("                        <div id=\"contact_form\">\n");
      out.write("                            <form action=\"contact\" method=\"post\">\n");
      out.write("                                <label for=\"name\">Họ và tên:</label>\n");
      out.write("                                <input type=\"text\" name=\"name\" required class=\"required input_field\" />\n");
      out.write("                                <div class=\"cleaner h10\"></div>\n");
      out.write("\n");
      out.write("                                <label for=\"email\">Email:</label>\n");
      out.write("                                <input type=\"email\" name=\"email\" required  class=\"validate-email required input_field\" />\n");
      out.write("                                <div class=\"cleaner h10\"></div>\n");
      out.write("\n");
      out.write("                                <label for=\"subject\">Chủ đề:</label>\n");
      out.write("                                <input type=\"text\" name=\"subject\" required class=\"input_field\"/>\n");
      out.write("                                <div class=\"cleaner h10\"></div>\n");
      out.write("\n");
      out.write("                                <label for=\"message\">Nội dung:</label>\n");
      out.write("                                <textarea id=\"text\" name=\"message\" required rows=\"0\" cols=\"0\" class=\"required\" style=\"width: 650px; height:135px\"></textarea>\n");
      out.write("                                <div class=\"cleaner h10\"></div>\n");
      out.write("\n");
      out.write("                                <h3 style=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${valid!=null?\"display:none;\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${valid==null?valid:\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("                                \n");
      out.write("                                <input type=\"submit\" value=\"Gửi\" class=\"submit_btn float_l\"/>\n");
      out.write("                                <input type=\"reset\" value=\"Đặt lại\" class=\"submit_btn float_r\"/>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"content_half float_r\">\n");
      out.write("                        <h6><strong>Địa chỉ:</strong></h6>\n");
      out.write("                        Khu Giáo dục và Đào tạo - Khu Công nghệ<br />\n");
      out.write("                        cao Hòa Lạc, Km29 Đại lộ Thăng Long<br />\n");
      out.write("                        Thạch Thất, TP. Hà Nội<br /><br />\n");
      out.write("\n");
      out.write("                        <strong>Số điện thoại:</strong> 09123456789<br />\n");
      out.write("                        <strong>Email:</strong>\n");
      out.write("                        <a href=\"mailto:duongdthe151367@fpt.edu.vn\">duongdthe151367@fpt.edu.vn</a><br />\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"cleaner h40\"></div>\n");
      out.write("\n");
      out.write("                    <iframe src=\"https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d61907.593704021514!2d105.49111818598686!3d21.012904401512078!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x31345b465a4e65fb%3A0xaae6040cfabe8fe!2zVHLGsOG7nW5nIMSQ4bqhaSBI4buNYyBGUFQ!5e0!3m2!1svi!2s!4v1631980139189!5m2!1svi!2s\" width=\"600\" height=\"450\" style=\"border:0;\" allowfullscreen=\"\" loading=\"lazy\"></iframe>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"cleaner\"></div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"footer\">\n");
      out.write("                <strong>Email:</strong>\n");
      out.write("                <a style=\"color: #D9DADF\" href=\"mailto:duongdthe151367@fpt.edu.vn\">duongdthe151367@fpt.edu.vn</a><br />\n");
      out.write("                <p>Address: Trường Đại học FPT, Hà Nội</p>\n");
      out.write("                <h5>&copy; Copyright 2021. Thuỳ Dương</h5>\n");
      out.write("            </div>\n");
      out.write("        </div>                            \n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <li style=\"list-style-type: none;\">\n");
        out.write("                                <a class=\"nav-link\" href=\"Login.jsp\">Đăng Nhập</a>\n");
        out.write("                            </li>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.data1}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("i");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <li class=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.getCategoryID()==id?\"active\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                        <a href=\"category?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.getCategoryID()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.getCategoryName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\n");
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

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.data}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("p");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <a href=\"productdetail\"><img style=\"width:220px\" class=\"trend\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.images}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/></a>\n");
          out.write("                                    <h4><a href=\"productdetail\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getProductName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h4>\n");
          out.write("                                    <p class=\"price\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getPrice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                    <div class=\"cleaner\"></div>\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
