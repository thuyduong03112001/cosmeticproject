<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
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
        <script src="https://code.jquery.com/jquery-latest.js"></script>
        <script>
            $(function () {
                var limitW = 102;
                var char = 4;
                var txt = $('p').html();
                var txtStart = txt.slice(0, limitW).replace(/\w+$/, '');
                var txtEnd = txt.slice(txtStart.length);
                if (txtEnd.replace(/\s+$/, '').split(' ').length > char) {
                    $('p').html([
                        txtStart,
                        '<a href="news" class="more" style="font-size: 13px;">Xem th??m...</a>',
                        '<span class="detail">',
                        txtEnd,
                        '</span>'
                    ].join('')
                            );
                }
                $('span.detail').hide();
                $('a.more').click(function () {
                    $(this).atrr('href', 'news');
                    return false;
                });
            });
        </script>
    </head>
    <body>
        <div id="templatemo_wrapper">
            <div id="templatemo_header">
                <div id="site_title">
                    <h1><a href="#">Cosmetic by DuongThuy</a></h1>
                </div>

                <div id="header_right">            
                    <c:if test="${sessionScope.acc.getAdmin() == 1}">
                        <a href="account">Qu???n l?? t??i kho???n</a> | 
                    </c:if>
                    <c:if test="${sessionScope.acc.getAdmin() == 1}">
                        <a href="manager">Kho h??ng</a> | 
                    </c:if>
                    <c:if test="${sessionScope.acc != null}">
                        <a href="profile">Xin ch??o ${sessionScope.acc.getName()}</a> |
                        <a href="logout">????ng xu???t</a>
                    </c:if>
                    <c:if test="${sessionScope.acc == null}">
                        <a href="Login.jsp">????ng Nh???p</a>
                    </c:if>
                </div>

                <div class="cleaner"></div>
            </div>

            <div id="templatemo_menu">
                <div id="top_nav" class="ddsmoothmenu">
                    <ul>
                        <li><a href="home" class="selected">Trang ch???</a></li>
                        <li><a href="product">S???n ph???m</a></li>
                        <li><a href="news">M??ch b???n</a></li>
                        <li><a href="checkout">Thanh to??n</a></li>
                        <li><a href="contact">Li??n h???</a></li>
                    </ul>
                    <br style="clear: left" />
                </div>

                <div id="menu_second_bar">
                    <div id="top_shopping_cart">
                        Gi??? h??ng c???a b???n: ${listCart.size() > 0 ? listCart.size() : 0} (<a href="shoppingcart">?????n gi??? h??ng</a>)
                    </div>
                    <div id="templatemo_search">
                        <form action="search" method="get">
                            <input type="text" name="txt" value="${requestScope.box}" placeholder="T??m ki???m..." onfocus="clearText(this)" onblur="clearText(this)" class="txt_field"/>
                            <button type="submit" class="sub_btn">T??m ki???m</button>
                        </form>
                    </div>
                    <div class="cleaner"></div>
                </div>
            </div>

            <div id="templatemo_middle" class="carousel">
                <div class="panel">
                    <div class="details_wrapper">
                        <div class="details">
                            <div class="detail" style="overflow: auto;">
                                <c:forEach items="${requestScope.news}" var="n">
                                    <h4><a href="news">${n.getTitle()}</a></h4>
                                    <p>${n.getContent()}</p>
                                </c:forEach>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="backgrounds">
                    <div class="item">
                        <img src="images/header1.jpg" alt="Slider 01" />
                    </div>

                    <div class="item">
                        <img src="images/header2.jpg" alt="Slider 02" />
                    </div>

                    <div class="item">
                        <img src="images/header3.jpg" alt="Slider 03" />
                    </div>
                </div>
            </div>

            <div id="templatemo_main">
                <div class="row">
                    <div class="col-sm-3" id="sidebar">
                        <div class="sidebar_box">
                            <span class="bottom"></span>
                            <h3>Danh M???c S???n Ph???m</h3>
                            <div class="content">
                                <ul class="sidebar_list">
                                    <c:set var="cid" value="${requestScope.id}"/>
                                    <c:forEach items="${requestScope.data1}" var="cat">
                                        <li class="${cat.getCategoryID()==id?"active":""}"><a href="category?id=${cat.getCategoryID()}">${cat.getCategoryName()}</a></li>
                                        </c:forEach>       
                                </ul>
                            </div>
                        </div>
                        <div class="sidebar_box">
                            <span class="bottom"></span>
                            <h3>S???n ph???m b??n ch???y</h3>
                            <div class="content">
                                <div class="bs_box">
                                    <c:forEach items="${requestScope.data}" var="p">
                                        <a href="productdetail?productId=${p.getProductId()}"><img class="trend" src="${p.images}"/></a>
                                        <h4><a href="productdetail?productId=${p.getProductId()}">${p.getProductName()}</a></h4>
                                        <h5 class="price">${p.getPrice()} VND</h5>
                                        <div class="cleaner"></div>
                                    </c:forEach>
                                </div>  
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-9" id="content">
                        <h1>S???n ph???m</h1>         
                        <div class="row">
                            <c:forEach items="${requestScope.list1}" var="pa">
                                <div class="col-12 col-md-6 col-lg-4">
                                    <div class="card">
                                        <img class="img-product" src="${pa.images}">
                                        <div class="card-body">
                                            <h3 class="card-title show_txt"><a  href="productdetail?productId=${pa.getProductId()}">${pa.getProductName()}</a></h3>
                                            <h5 class="product_price">${pa.getPrice()} VND</h5>
                                            <div class="row">
                                                <a href="add-to-cart?productId=${pa.getProductId()}" class="add_to_card" style="color: #fff">Th??m gi??? h??ng</a>
                                                <a href="productdetail?productId=${pa.getProductId()}" class="detail2">Chi ti???t</a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </c:forEach>
                        </div>  
                    </div>
                </div>
                <div class="cleaner"></div>
            </div>

            <div id="footer">
                <strong>Email:</strong>
                <a style="color: #D9DADF" href="mailto:duongdthe151367@fpt.edu.vn">duongdthe151367@fpt.edu.vn</a><br/>
                <h5>Address: Tr?????ng ?????i h???c FPT, H?? N???i</h5>
                <h5>&copy; Copyright 2021. Thu??? D????ng</h5>
            </div>

        </div>

        <script>
            var myIndex = 0;
            carousel();

            function carousel() {
                var i;
                var x = document.getElementsByClassName("item");
                for (i = 0; i < x.length; i++) {
                    x[i].style.display = "none";
                }
                myIndex++;
                if (myIndex > x.length) {
                    myIndex = 1;
                }
                x[myIndex - 1].style.display = "block";
                setTimeout(carousel, 3000);
            }
        </script>

    </body>
</html>
