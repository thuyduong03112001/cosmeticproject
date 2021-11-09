<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta name="keywords" content="" />
        <meta name="description" content="" />
        <link rel="stylesheet" type="text/css" media="all" href="css/jquery.dualSlider.0.2.css"/>
        <link href="css/templatemo_style.css" rel="stylesheet" type="text/css" />
        <link rel="stylesheet" type="text/css" href="css/ddsmoothmenu.css" />
        <script type="text/javascript" src="js/jquery.min.js"></script>
        <script type="text/javascript" src="js/ddsmoothmenu.js"></script>
        <script type="text/javascript">
            ddsmoothmenu.init({
                mainmenuid: "top_nav",
                orientation: "h",
                classname: "ddsmoothmenu",
                contentsource: "markup"
            });
        </script>
        <script src="js/jquery-1.3.2.min.js" type="text/javascript"></script>
        <script src="js/jquery.easing.1.3.js" type="text/javascript"></script>
        <script src="js/jquery.timers-1.2.js" type="text/javascript"></script>
        <script src="js/jquery.dualSlider.0.3.min.js" type="text/javascript"></script>
    </head>
    <body>
        <div id="templatemo_wrapper">
            <div id="templatemo_header">
                <div id="site_title">
                    <h1><a href="#">Cosmetic by DuongThuy</a></h1>
                </div>

                <div id="header_right">
                    <c:if test="${sessionScope.acc.getAdmin() == 1}">
                        <a href="account">Quản lý tài khoản</a> |
                    </c:if>
                    <c:if test="${sessionScope.acc.getAdmin() == 1}">
                        <a href="manager">Kho hàng</a> |
                    </c:if>
                    <c:if test="${sessionScope.acc != null}">
                        <a href="#">Xin chào ${sessionScope.acc.getName()}</a> |
                        <a href="logout">Đăng xuất</a>
                    </c:if>
                    <c:if test="${sessionScope.acc == null}">
                        <a href="Login.jsp">Đăng Nhập</a>
                    </c:if>
                </div>
                <div class="cleaner"></div>
            </div>

            <div id="templatemo_menu">
                <div id="top_nav" class="ddsmoothmenu">
                    <ul>
                        <li><a href="home">Trang chủ</a></li>
                        <li><a href="product">Sản phẩm</a></li>
                        <li><a href="news">Mách bạn</a></li>
                        <li><a href="checkout">Thanh toán</a></li>
                        <li><a href="contact" class="selected">Liên hệ</a></li>
                    </ul>
                    <br style="clear: left" />
                </div>
                <div id="menu_second_bar">
                    <div id="top_shopping_cart">
                        Giỏ hàng của bạn: ${listCart.size() > 0 ? listCart.size() : 0} (<a href="shoppingcart">Đến giỏ hàng</a>)
                    </div>
                    <div id="templatemo_search">
                        <form action="search" method="get">
                            <input type="text" name="txt" value="${requestScope.box}" placeholder="Tìm kiếm..." onfocus="clearText(this)" onblur="clearText(this)" class="txt_field"/>
                            <button type="submit" class="sub_btn">Tìm kiếm</button>
                        </form>
                    </div>
                    <div class="cleaner"></div>
                </div>
            </div>


            <div id="templatemo_main">
                <div id="sidebar" class="float_l">
                    <div class="sidebar_box">
                        <span class="bottom" style="width:250px"></span>
                        <h3>Danh Mục Sản Phẩm</h3>
                        <div class="content">                            
                            <ul class="sidebar_list">                               
                                <c:forEach items="${requestScope.data1}" var="i">
                                    <li class="${i.getCategoryID()==id?"active":""}">
                                        <a href="category?id=${i.getCategoryID()}">${i.getCategoryName()}</a></li>
                                    </c:forEach>   
                            </ul>  
                        </div>
                    </div>
                    <div class="sidebar_box">
                        <span class="bottom" style="width:250px"></span>
                        <h3>Sản phẩm bán chạy</h3>
                        <div class="content">
                            <div class="bs_box">
                                <c:forEach items="${requestScope.data}" var="p">
                                    <a href="productdetail?productId=${p.getProductId()}"><img style="width:220px" class="trend" src="${p.images}"/></a>
                                    <h4><a href="productdetail?productId=${p.getProductId()}">${p.getProductName()}</a></h4>
                                    <p class="price">${p.getPrice()} VND</p>
                                    <div class="cleaner"></div>
                                </c:forEach>
                            </div>  
                        </div>
                    </div>
                </div>
                <div id="content" class="float_r">
                    <h1> Liên hệ chúng tôi</h1>
                    <div class="content_half float_l">
                        <h4>Thông tin...</h4>
                        <p>
                            Vui lòng điền đầy đủ thông tin vào<br>chỗ trống bên dưới trước khi gửi!
                        </p>
                        <div id="contact_form">
                            <form action="contact" method="post">
                                <label for="name">Họ và tên:</label>
                                <input type="text" name="name" required class="required input_field" />
                                <div class="cleaner h10"></div>

                                <label for="email">Email:</label>
                                <input type="email" name="email" required  class="validate-email required input_field" />
                                <div class="cleaner h10"></div>

                                <label for="subject">Chủ đề:</label>
                                <input type="text" name="subject" required class="input_field"/>
                                <div class="cleaner h10"></div>

                                <label for="message">Nội dung:</label>
                                <textarea id="text" name="message" required rows="0" cols="0" class="required" style="width: 650px; height:135px"></textarea>
                                <div class="cleaner h10"></div>

                                <%
                                    if (request.getAttribute("valid") != null) {
                                        String valid = (String) request.getAttribute("valid");
                                %>
                                <h4 style="color: #08aee3"><%=valid%></h4>
                                <%
                                    }
                                %>

                                <input type="submit" value="Gửi" class="submit_btn float_l"/>
                                <input type="reset" value="Đặt lại" class="submit_btn float_r"/>
                            </form>
                        </div>
                    </div>
                    <div class="content_half float_r">
                        <h6><strong>Địa chỉ:</strong></h6>
                        Khu Giáo dục và Đào tạo - Khu Công nghệ<br />
                        cao Hòa Lạc, Km29 Đại lộ Thăng Long<br />
                        Thạch Thất, TP. Hà Nội<br /><br />

                        <strong>Số điện thoại:</strong> 09123456789<br />
                        <strong>Email:</strong>
                        <a href="mailto:duongdthe151367@fpt.edu.vn">duongdthe151367@fpt.edu.vn</a><br />
                    </div>

                    <div class="cleaner h40"></div>

                    <iframe src="https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d61907.593704021514!2d105.49111818598686!3d21.012904401512078!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x31345b465a4e65fb%3A0xaae6040cfabe8fe!2zVHLGsOG7nW5nIMSQ4bqhaSBI4buNYyBGUFQ!5e0!3m2!1svi!2s!4v1631980139189!5m2!1svi!2s" width="600" height="450" style="border:0;" allowfullscreen="" loading="lazy"></iframe>
                </div>
                <div class="cleaner"></div>
            </div>

            <div id="footer">
                <strong>Email:</strong>
                <a style="color: #D9DADF" href="mailto:duongdthe151367@fpt.edu.vn">duongdthe151367@fpt.edu.vn</a><br />
                <p>Address: Trường Đại học FPT, Hà Nội</p>
                <h5>&copy; Copyright 2021. Thuỳ Dương</h5>
            </div>
        </div>                            
    </body>
</html>
