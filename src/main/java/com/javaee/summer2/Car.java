package com.javaee.summer2;

public class Car {
    Long id;
    String name;
    String model;
    int year;
    int price;

    private static Long idCount = 1L;

    public Car(String name, String model, int year, int price) {
        this.id = idCount;
        this.name = name;
        this.model = model;
        this.year = year;
        this.price = price;

        idCount++;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
