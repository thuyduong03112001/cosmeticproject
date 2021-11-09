<%-- 
    Document   : view-history
    Created on : Oct 26, 2021, 8:29:45 PM
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile cá nhân</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta2/css/all.min.css">
       
    </head>
    <body>
            <div class="container">
                <div id="myCarousel" class="carousel slide" data-ride="carousel">

                    <!-- Indicators -->
                    <ul class="carousel-indicators">
                        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                        <li data-target="#myCarousel" data-slide-to="1"></li>
                    </ul>

                    <!-- The slideshow -->
                    <div class="carousel-inner">
                        <div class="carousel-item active">
                            <img src="images/header1.jpg" width="1100" height="500">
                        </div>
                        <div class="carousel-item">
                            <img src="images/header2.jpg" width="1100" height="500">
                        </div>
                    </div>
                </div>
                <div class="mt-3 mb-3">
                    <!-- Nav tabs -->
                    <ul class="nav nav-tabs">
                        <li class="nav-item">
                            <a class="nav-link ${viewHistory != null ? "" : "active"}" data-toggle="tab" href="#home">Thông tin cá nhân</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link ${viewHistory != null ? "active" : ""}" data-toggle="tab" href="#menu1"  onclick="viewHistoryOrder();">Lịch sử mua hàng</a>
                        </li>
                    </ul>

                    <!-- Tab panes -->
                    <div class="tab-content">
                        <div id="home" class="container tab-pane ${viewHistory != null ? "fade" : "active"}"><br>
                            <h3>Thông tin cá nhân</h3>
                            <form action="profile" method="post">
                                <div class="form-group info-profile">
                                    <label for="usr">Họ và tên : </label>
                                    <input type="text" class="form-control" name="fullname" value="${acc.getFullName()}">
                            </div>
                            <div class="form-group info-profile">
                                <label for="usr">Số điện thoại:</label>
                                <input type="text" class="form-control" name="phone" value="${acc.getPhone()}">
                            </div>
                            <div class="form-group info-profile">
                                <label for="usr">Địa chỉ :</label>
                                <textarea type="text" class="form-control" name="address">${acc.getAddress()}</textarea>
                            </div>
                            <button type="submit" class="btn btn-sm btn-info" >Cập nhập</button>
                        </form>
                    </div>
                    <div id="menu1" class="container tab-pane  ${viewHistory != null ? "active" : "fade"} "><br>
                        <h3>Lịch sử mua hàng</h3>
                        <table class="table">
                            <thead>
                                <tr>
                                    <th>Ngày Mua hàng</th>
                                    <th>Tổng tiền</th>
                                    <th>Trạng thái</th>
                                    <th></th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach items="${listOrder}" var="order" >
                                    <tr>
                                        <td>${order.getCreateDate()}</td>
                                        <td>${order.getTotalprice()}</td>
                                        <td>${order.getStatusId()}</td>
                                        <td><a class="btn btn-sm btn-danger" href="#">Chi tiết</a></td>
                                    </tr>
                                </c:forEach> 

                            </tbody>
                        </table>

                    </div>
                </div>
            </div>

        </div>
        <div id="footer">
                <strong>Email:</strong>
                <a style="color: #D9DADF" href="mailto:duongdthe151367@fpt.edu.vn">duongdthe151367@fpt.edu.vn</a><br/>
                <h5>Address: Trường Đại học FPT, Hà Nội</h5>
                <h5>&copy; Copyright 2021. Thuỳ Dương</h5>
            </div>
    </body>
    <script type="text/javascript">
        function viewHistoryOrder() {
            window.location.href = "profile?viewHistory=true";
        }
    </script>
</html>
