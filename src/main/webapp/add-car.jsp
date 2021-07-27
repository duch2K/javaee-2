<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Car</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <form action="/add" method="post" style="max-width: 500px">
            <div class="mb-3">
                <label for="input1" class="form-label">Name</label>
                <input type="text" name="name" class="form-control" id="input1" aria-describedby="emailHelp">
            </div>
            <div class="mb-3">
                <label for="input2" class="form-label">Surname</label>
                <input type="text" name="model" class="form-control" id="input2">
            </div>
            <div class="mb-3">
                <label for="input4" class="form-label">Salary</label>
                <input type="number" name="year" class="form-control" id="input4">
            </div>
            <div class="mb-3">
                <label for="input5" class="form-label">Transfer price</label>
                <input type="number" name="price" class="form-control" id="input5">
            </div>

            <button type="submit" class="btn btn-primary">Add</button>
        </form>
    </div>
</body>
</html>
