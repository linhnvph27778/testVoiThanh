<%@page language="java" pageEncoding="UTF-8" %>

<html>
<head>
    <title>It17321</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>
    <div class="col-4 offset-4">
        <form method="post" action="/cua-hang/add">
            <div class="mt-3">
                <label>Id</label>
                <input type="text" name="id" class="form-control" >
            </div>
            <div class="mt-3">
                <label>Mã</label>
                <input type="text" name="ma" class="form-control" >
            </div>
            <div class="mt-3">
                <label>Tên</label>
                <input type="text" name="ten" class="form-control" >
            </div>
            <div class="mt-3">
                <label>Địa chỉ</label>
                <input type="text" name="diaChi" class="form-control" >
            </div>
            <div class="mt-3">
                <label>Quấc gia</label>
                <input type="text" name="quacGia" class="form-control" >
            </div>

            <button class="btn btn-primary mt-3" type="submit">Add</button>

        </form>
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