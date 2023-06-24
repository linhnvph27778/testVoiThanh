
<%@page language="java" pageEncoding="UTF-8" %>

<html>
<head>
    <title>It17321</title>
</head>
<body>
<form method="get" action="/cua-hang/index">
    <div>
        <label>Id:</label>
        ${ch.id}
    </div>
    <div>
        <label>Mã:</label>
        ${ch.ma}
    </div>
    <div>
    <label>Tên:</label>
        ${ch.ten}
    </div>
    <div>
        <label>Địa chỉ:</label>
        ${ch.diaChi}
    </div>
    <div>
        <label>Quấc gia:</label>
        ${ch.quacGia}
    </div>
    <button type="submit">back</button>
</form>

</body>
</html>