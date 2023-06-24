<%@page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>It17321</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>
    <div class="col-8 offset-2">
        <a class="btn btn-primary mt-3" href="/cua-hang/create">Add</a>
        <table class="table table-bordered bordered-dark text-center mt-3">
            <thead class="bg-info">
            <tr>
                <th>id</th>
                <th>Mã</th>
                <th>Tên</th>
                <th>Địa chỉ</th>
                <th>Quấc gia</th>
                <th colspan="3">Hành động</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${list}" var="ch">
                <tr>
                    <td>${ch.id}</td>
                    <td>${ch.ma}</td>
                    <td>${ch.ten}</td>
                    <td>${ch.diaChi}</td>
                    <td>${ch.quacGia}</td>
                    <td>
                        <a href="/cua-hang/detail/${ch.id}">detail</a>
                        <a href="/cua-hang/delete/${ch.id}">delete</a>
                        <a href="/cua-hang/viewUpdate/${ch.id}">update</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>

</body>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"
        integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.min.js"
        integrity="sha384-mQ93GR66B00ZXjt0YO5KlohRA5SY2XofN4zfuZxLkoj1gXtW8ANNCe9d5Y3eG5eD"
        crossorigin="anonymous"></script>
</html>