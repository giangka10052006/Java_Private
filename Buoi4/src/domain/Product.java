package domain;

import java.util.Random;

public class Product {
    private int id;
    private String name;
    private String description;
    private double price;

    public Product(){

    }

    public Product(String name, String description, double price) {
        this.id = new Random().nextInt(1000) + 1;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getInfo(){
        return "ID: " + id + ", Name: " + name + ", Description: " + description + ", Price: " + price + "$";
    }
}
