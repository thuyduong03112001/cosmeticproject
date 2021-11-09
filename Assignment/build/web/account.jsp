<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Account Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
        <style>
            table{
                background-color: white;
                color: black;
                display: flex;
                justify-content: center;
            }
            th{
                background-color: pink;
                text-transform: uppercase;
                padding: 10px 30px;
            }
            table, th, td {
                border: 1px solid #000;
            }
            body{
                text-align: center;
            }
        </style>
    </head>
    <body>
        <table class="table table-striped">
                <tr>
                    <th>ID</th>
                    <th>FullName</th>
                    <th>Address</th>
                    <th>Phone</th>
                    <th>UserName</th>
                </tr>
            <c:forEach items="${listA}" var="u">
                 <tr>
                    <th>${u.getAccountID()}</th>
                    <th>${u.getFullName()}</th>
                    <th>${u.getAddress()}</th>
                    <th>${u.getPhone()}</th>
                    <th>${u.getName()}</th>
                </tr>
            </c:forEach>                             
        </table>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js" integrity="sha384-q2kxQ16AaE6UbzuKqyBE9/u/KzioAlnx2maXQHiDX9d4/zp8Ok3f+M7DPm+Ib6IU" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.min.js" integrity="sha384-pQQkAEnwaBkjpqZ8RU1fF1AKtTcHJwFl3pblpTlHXybJjHpMYo79HY3hIi4NKxyj" crossorigin="anonymous"></script>
    </body>
</html>
