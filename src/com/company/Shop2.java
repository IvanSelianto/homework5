package com.company;

import java.util.HashMap;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Shop2 implements Shop {
    private Map<Product, Integer> mapOfProducts = new HashMap();
    private int counter;
    private double doubleCounter;

    public Shop2() {

    }

    public Map<Product, Integer> getMapOfProducts() {
        return mapOfProducts;
    }

    public void setMapOfProducts(Map<Product, Integer> mapOfProducts) {
        this.mapOfProducts = mapOfProducts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop2 shop2 = (Shop2) o;
        return mapOfProducts.equals(shop2.mapOfProducts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mapOfProducts);
    }

    public String toString() {

        return mapOfProducts + "\n" + doubleCounter;
    }


    public void addProduct(Product product) {
        if (mapOfProducts.containsKey(product)) {
            counter++;
        } else {
            counter = 1;
        }
        mapOfProducts.put(product, counter);


    }


    public Paycheck getCheck(List<Long> id) {
        Paycheck paycheck = new Paycheck();
        paycheck.put(mapOfProducts);
        mapOfProducts.clear();


        return paycheck;
    }
}
