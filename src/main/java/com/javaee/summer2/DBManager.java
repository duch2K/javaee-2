package com.javaee.summer2;

import java.util.ArrayList;

public class DBManager {
    static ArrayList<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car(
                  "Mercedes", "E280", 2013, 15000
        ));
        cars.add(new Car(
                  "Toyota", "Land Cruiser 200",2016, 45000
        ));
        cars.add(new Car(
                  "Kia", "Rio",2015, 12000
        ));
    }
    static void addCar(Car car) {
        cars.add(car);
    }

    static Car getCar(Long id) {
        return cars.get(id.intValue());
    }

    static ArrayList<Car> getAllCars() {
        return cars;
    }

    static ArrayList<Car> getCarsByName(String name) {
        ArrayList<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getName().equals(name)) {
                result.add(car);
            }
        }
        return result;
    }

    static ArrayList<Car> getCarsByModel(String model) {
        ArrayList<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getModel().equals(model)) {
                result.add(car);
            }
        }
        return result;
    }

    static ArrayList<Car> getCarsByYear(int year) {
        ArrayList<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() >= year) {
                result.add(car);
            }
        }
        return result;
    }

    static ArrayList<Car> getCarsByPrice(int price) {
        ArrayList<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getPrice() <= price) {
                result.add(car);
            }
        }
        return result;
    }

    static void deleteCar(Long id) {
        cars.remove(id.intValue());
    }
}
