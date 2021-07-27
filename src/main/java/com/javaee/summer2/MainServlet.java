package com.javaee.summer2;

import java.io.*;
import java.util.ArrayList;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/")
public class MainServlet extends HttpServlet {
    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ArrayList<Car> cars;
        if (request.getParameterMap().containsKey("submit")) {
            String filter = request.getParameter("filter");
            String value = request.getParameter("value");

            switch (filter) {
                case "name":
                    cars = DBManager.getCarsByName(value);
                    break;
                case "model":
                    cars = DBManager.getCarsByModel(value);
                    break;
                case "year":
                    cars = DBManager.getCarsByYear(Integer.parseInt(value));
                    break;
                case "price":
                    cars = DBManager.getCarsByPrice(Integer.parseInt(value));
                    break;
                default:
                    cars = new ArrayList<>();
                    break;
            }
        } else {
            cars = DBManager.getAllCars();
        }

        try {
            request.setAttribute("cars", cars);

            request.getRequestDispatcher("/cars.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void destroy() {
    }
}
