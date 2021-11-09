package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class checkout_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
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
      out.write("        <title>Checkout Page</title>\n");
      out.write("        <meta name=\"keywords\" content=\"\" />\n");
      out.write("        <meta name=\"description\" content=\"\" />\n");
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
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"css/jquery.dualSlider.0.2.css\"/>\n");
      out.write("        <script src=\"js/jquery-1.3.2.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/jquery.easing.1.3.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/jquery.timers-1.2.js\" type=\"text/javascript\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"templatemo_wrapper\">\n");
      out.write("            <div id=\"templatemo_header\">\n");
      out.write("                <div id=\"site_title\">\n");
      out.write("                    <h1><a href=\"#\">Cosmetic by DuongThuy</a></h1>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div id=\"header_right\">\n");
      out.write("                    <a href=\"#\"> Đăng Nhập</a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"cleaner\"></div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"templatemo_menu\">\n");
      out.write("                <div id=\"top_nav\" class=\"ddsmoothmenu\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"home\">Trang chủ</a></li>\n");
      out.write("                        <li><a href=\"product\">Sản phẩm</a></li>\n");
      out.write("                        <li><a href=\"news\">Mách bạn</a></li>\n");
      out.write("                        <li><a href=\"checkout\" class=\"selected\">Thanh toán</a></li>\n");
      out.write("                        <li><a href=\"contact\">Liên hệ</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <br style=\"clear: left\" />\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div id=\"menu_second_bar\">\n");
      out.write("                    <div id=\"top_shopping_cart\">\n");
      out.write("                        Giỏ hàng của bạn: (<a href=\"shoppingcart.html\">Đến giỏ hàng</a>)\n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"templatemo_search\">\n");
      out.write("                        <form action=\"#\" method=\"get\">\n");
      out.write("                            <input type=\"text\" value=\"Tìm kiếm\" name=\"keyword\" id=\"keyword\" title=\"keyword\" onfocus=\"clearText(this)\" onblur=\"clearText(this)\" class=\"txt_field\"/>\n");
      out.write("                            <input type=\"submit\" name=\"Tìm kiếm\" value=\" Tìm kiếm \" alt=\"Search\" id=\"searchbutton\" title=\"Search\" class=\"sub_btn\" />\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"cleaner\"></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"templatemo_main\">\n");
      out.write("                <div id=\"sidebar\" class=\"float_l\">\n");
      out.write("                    <div class=\"sidebar_box\">\n");
      out.write("                        <span class=\"bottom\"></span>\n");
      out.write("                        <h3>Danh Mục Sản Phẩm</h3>\n");
      out.write("                        <div class=\"content\">\n");
      out.write("                            <ul class=\"sidebar_list\">\n");
      out.write("                                ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("       \n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"sidebar_box\">\n");
      out.write("                        <span class=\"bottom\"></span>\n");
      out.write("                        <h3>Sản phẩm bán chạy</h3>\n");
      out.write("                        <div class=\"content\">\n");
      out.write("                            <div class=\"bs_box\">\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"content\" class=\"float_r\">\n");
      out.write("                    <h2>Thanh toán</h2>\n");
      out.write("                    <h5><strong>Chi tiết hóa đơn</strong></h5>\n");
      out.write("                    <div class=\"content_half float_l checkout\">\n");
      out.write("                        Họ và tên người nhận:\n");
      out.write("                        <input type=\"text\" style=\"width: 300px\" />\n");
      out.write("                        Địa chỉ:\n");
      out.write("                        <input type=\"text\" style=\"width: 300px\" />\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"content_half float_r checkout\">\n");
      out.write("                        Email:\n");
      out.write("                        <input type=\"text\" style=\"width: 300px\" />\n");
      out.write("                        Số điện thoại người nhận:<br />\n");
      out.write("                        <input type=\"text\" style=\"width: 300px\" />\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"cleaner h50\"></div>\n");
      out.write("                    <h4>Tổng cộng: <strong></strong></h4>\n");
      out.write("                    <p><input type=\"checkbox\" />Thanh toán khi nhận hàng</p>\n");
      out.write("                    <input type=\"submit\" value=\"Xong\" />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"cleaner\"></div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"footer\">\n");
      out.write("                <strong>Email:</strong>\n");
      out.write("                <a style=\"color: #d9dadf\" href=\"mailto:duongdthe151367@fpt.edu.vn\">duongdthe151367@fpt.edu.vn</a><br />\n");
      out.write("                <h5>Address: Trường Đại học FPT, Hà Nội</h5>\n");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("cid");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.id}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
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
    _jspx_th_c_forEach_0.setVar("cat");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <li class=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cat.getCategoryID()==id?\"active\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><a href=\"category?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cat.getCategoryID()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cat.getCategoryName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
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
          out.write("                                    <a href=\"productdetail\"><img class=\"trend\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.images}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/></a>\n");
          out.write("                                    <h4><a href=\"productdetail\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getProductName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h4>\n");
          out.write("                                    <h5 class=\"price\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getPrice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h5>\n");
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
