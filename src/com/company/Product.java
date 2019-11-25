package com.company;

public  abstract  class Product {
    private String name;
    private  long id;
    private double cost;


    public Product(String name, long id, double cost){
        this.name = name;
        this.id = id;
        this.cost = cost;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String toString() {
        return name;
    }
}
