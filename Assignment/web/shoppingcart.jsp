<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cart Page</title>
        <meta name="keywords" content="" />
        <meta name="description" content="" />
        <link href="css/templatemo_style.css" rel="stylesheet" type="text/css" />
        <link rel="stylesheet" href="themify-icons/themify-icons.css"/>
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
                        <li><a href="checkout" class="selected">Thanh toán</a></li>
                        <li><a href="contact">Liên hệ</a></li>
                    </ul>
                    <br style="clear: left" />
                </div>

                <div id="menu_second_bar">
                    <div id="top_shopping_cart">
                        <c:set var="size" value="${sessionScope.size}"/>
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
                    <h1 style="text-align: center">Giỏ hàng của bạn</h1>
                    <c:if test="${not empty listCart}">
                        <table width="670px" cellspacing="0" cellpadding="5">
                            <tr bgcolor="#ddd">
                                <th width="220" align="left" style="text-align: center">Ảnh</th>
                                <th width="190" align="left">Tên sản phẩm</th>
                                <th width="100" align="center">Số lượng</th>
                                <th width="100" align="right" style="text-align: center">Giá</th>
                                <th width="50" align="right">Xóa</th>
                                <th width="30"></th>
                            </tr>
                            <c:forEach items="${listCart}" var="cart" varStatus="loop">
                                <tr>
                                    <td><img style="width: 190px; height: 140px" src="${cart.getImage()}"/></td>
                                    <td style="font-size: 14px; font-style: initial; font-weight: 600">${cart.getName()}</td>
                                    <td align="center">
                                        <div class="input-group mb-4" style="width: 100px;">
                                            <span>
                                                <a href="re-load-quan?actionQuan=1&quantity=${cart.quantity}&productId=${cart.productId}" class="btn"  data-type="minus" data-field="">
                                                    <i class="icon1 ti-minus"></i>
                                                </a>
                                            </span>
                                            <input style="width: 35px"type="number" id="quantity" name="quantity" class="form-control input-number" value="${cart.quantity}" min="1" max="100" required>
                                            <span>
                                                <a href="re-load-quan?actionQuan=2&quantity=${cart.quantity}&productId=${cart.productId}" class="btn" data-type="plus" data-field="">
                                                    <i class="icon1 ti-plus"></i>
                                                </a>
                                            </span>
                                        </div>
                                    </td>
                                    <td align="right" style="text-align: center">${cart.getPrice()} VND</td>
                                    <td align="center"><a style="text-align: center; font-size: 16px" href="remove-product?productId=${cart.getProductId()}" style="font-size:17px; font-weight: 500">Xóa</a></td>
                                </tr>
                            </c:forEach>
                            <tr>
                                <td style="background: #ddd; font-weight: bold;">
                                    Tổng tiền: 
                                </td>
                                <td align="right" style="background: #ddd; font-weight: bold">
                                    ${totalPrice} VND
                                </td>
                            </tr>
                        </table>
                        <div style="padding-top: 40px">
                            <h4><strong> Thông tin người nhận</strong></h4>
                            Họ và tên người nhận: ${acc.getFullName()}<br>                         
                            Địa chỉ: ${acc.getAddress()}<br>
                            Số điện thoại người nhận: ${acc.getPhone()} <br>
                        </div>
                        <p><input type="checkbox"/>Thanh toán khi nhận hàng</p>
                        <div style="float: left; width: 215px; margin-top: 20px">
                            <button><a href="payment?totalPrice=${totalPrice}">Thanh Toán</a></button>
                        </div>
                        <div style="float: left; width: 215px; margin-top: 20px">
                            <button><a href="product">Tiếp tục mua hàng</a></button>
                        </div>
                    </c:if>
                    <c:if test="${empty listCart}">
                        <h5 class="text-center" style="font-size: 18px">Hiện tại giỏ đang trống!</h5>
                        <div class="text-center mb-4">
                            <a href="home" style="font-size: 18px">Quay lại trang mua sắm</a>
                        </div>
                    </c:if>
                    
                    <h3 class="mt-5 text-center">${message}</h3>
                </div>
                <div class="cleaner"></div>
            </div>

            <div id="footer">
                <strong>Email:</strong>
                <a style="color: #d9dadf" href="mailto:duongdthe151367@fpt.edu.vn">duongdthe151367@fpt.edu.vn</a><br />
                <p>Address: Trường Đại học FPT, Hà Nội</p>
                <h5>&copy; Copyright 2021. Thuỳ Dương</h5>
            </div>
        </div>
    </body>
</html>
