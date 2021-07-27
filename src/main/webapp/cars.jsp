<%@ page import="com.javaee.summer2.Car" %>
<%@ page import="java.util.ArrayList" %>

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Cars</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <h2 class="mb-2 mt-3"><%= "YO!" %></h2>

        <a href="/add-car.jsp" class="btn btn-primary mb-2">Add player</a>

        <form class="d-flex mb-3" style="max-width: 500px">
            <select class="form-select" aria-label="Default select example" name="filter">
                <option selected> -- </option>
                <option value="name">Name</option>
                <option value="model">Model</option>
                <option value="year">Year</option>
                <option value="price">Price</option>
            </select>

            <input class="form-control me-2" type="search" name="value" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-success" type="submit" name="submit">Search</button>
        </form>
        <%
            ArrayList<Car> cars = (ArrayList<Car>) request.getAttribute("cars");
            for (Car c : cars) {
        %>
        <div class="card m-2" style="width: 18rem; font-size: 14px;">
            <div class="card-body">
                <h5 class="card-title">
                    <%= c.getName() + " " + c.getModel() %>
                </h5>
                <div>
                    <b>Year:</b> <%= c.getYear() %>
                </div>
                <div>
                    <b>Price:</b> <%= c.getPrice() %> EUR
                </div>
                <a href="#" class="card-link">details</a>
            </div>
        </div>
        <% } %>
    </div>

</body>
</html>
