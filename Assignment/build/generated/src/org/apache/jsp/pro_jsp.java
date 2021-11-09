package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home Page</title>\n");
      out.write("        \n");
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
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $(\".carousel\").dualSlider({\n");
      out.write("                    auto: true,\n");
      out.write("                    autoDelay: 6000,\n");
      out.write("                    easingCarousel: \"swing\",\n");
      out.write("                    easingDetails: \"easeOutBack\",\n");
      out.write("                    durationCarousel: 1000,\n");
      out.write("                    durationDetails: 600\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"templatemo_wrapper\">\n");
      out.write("            <div id=\"templatemo_header\">\n");
      out.write("                <div id=\"site_title\">\n");
      out.write("                    <h1><a href=\"#\">Cosmetic by DuongThuy</a></h1>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div id=\"header_right\">            \n");
      out.write("                    <ul class=\"navbar-nav m-auto\">\n");
      out.write("                        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"cleaner\"></div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"templatemo_menu\">\n");
      out.write("                <div id=\"top_nav\" class=\"ddsmoothmenu\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"home.jsp\" class=\"selected\">Trang chủ</a></li>\n");
      out.write("                        <li><a href=\"product.jsp\">Sản phẩm</a></li>\n");
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
      out.write("                            <input type=\"text\" value=\"Tìm kiếm\" name=\"keyword\" id=\"keyword\" title=\"keyword\" onfocus=\"clearText(this)\" onblur=\"clearText(this)\" class=\"txt_field\"/>\n");
      out.write("                            <input type=\"submit\" name=\"Search\" value=\" Tìm kiếm \" alt=\"Search\" id=\"searchbutton\" title=\"Tìm kiếm\" class=\"sub_btn\"/>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"cleaner\"></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"templatemo_middle\" class=\"carousel\">\n");
      out.write("                <div class=\"panel\">\n");
      out.write("                    <div class=\"details_wrapper\">\n");
      out.write("                        <div class=\"details\">\n");
      out.write("                            <div class=\"detail\">\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"paging\">\n");
      out.write("                        <div id=\"numbers\"></div>\n");
      out.write("                        <a href=\"javascript:void(0);\" class=\"previous\" title=\"Previous\">Trước đó</a>\n");
      out.write("                        <a href=\"javascript:void(0);\" class=\"next\" title=\"Next\">Tiếp theo</a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <a href=\"javascript:void(0);\" class=\"play\" title=\"Turn on autoplay\">Play</a>\n");
      out.write("                    <a href=\"javascript:void(0);\" class=\"pause\" title=\"Turn off autoplay\">Pause</a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"backgrounds\">\n");
      out.write("                    <div class=\"item item_1\">\n");
      out.write("                        <img src=\"images/header1.jpg\" alt=\"Slider 01\" />\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"item item_2\">\n");
      out.write("                        <img src=\"images/header2.jpg\" alt=\"Slider 02\" />\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"item item_3\">\n");
      out.write("                        <img src=\"images/header3.jpg\" alt=\"Slider 03\" />\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div id=\"footer\">\n");
      out.write("                <strong>Email:</strong>\n");
      out.write("                <a style=\"color: #D9DADF\" href=\"mailto:duongdthe151367@fpt.edu.vn\">duongdthe151367@fpt.edu.vn</a><br />\n");
      out.write("                <p>Address: Trường Đại học FPT, Hà Nội</p>\n");
      out.write("                <h5>&copy; Copyright 2021. Thuỳ Dương</h5>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.isAdmin == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <li class=\"nav-item\">\n");
        out.write("                                <a class=\"nav-link\" href=\"account\">Manager Account</a>\n");
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

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.isSell == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <li class=\"nav-item\">\n");
        out.write("                                <a class=\"nav-link\" href=\"manager\">Manager Product</a>\n");
        out.write("                            </li>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <li class=\"nav-item\">\n");
        out.write("                                <a class=\"nav-link\" href=\"#\">Hello ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a>\n");
        out.write("                            </li>\n");
        out.write("                            <li class=\"nav-item\">\n");
        out.write("                                <a class=\"nav-link\" href=\"logout\">Logout</a>\n");
        out.write("                            </li>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <li style=\"list-style-type: none;\">\n");
        out.write("                                <a class=\"nav-link\" href=\"Login.jsp\">Đăng Nhập</a>\n");
        out.write("                            </li>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.news}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("n");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <h4><a href=\"#\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${n.getTitle()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h4>\n");
          out.write("                                    <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${n.getContent()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                    <a href=\"#\" title=\"Read more\" class=\"more\">Hơn nữa</a>\n");
          out.write("                                ");
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
