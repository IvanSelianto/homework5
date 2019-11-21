package com.company;


import java.util.HashMap;

import java.util.Map;

public class Paycheck {
    private Map<Product, Integer> mapOfProducts = new HashMap<>();
    private double doubleCounter;

    public Paycheck() {


    }

    private Paycheck(Map<Product, Integer> mapOfProducts, double doubleCounter) {
        this.mapOfProducts = mapOfProducts;
        this.doubleCounter = doubleCounter;

    }

    public Paycheck put(Map<Product, Integer> mapOfProducts) {
        this.mapOfProducts = mapOfProducts;

        for (Map.Entry<Product, Integer> entry :
                mapOfProducts.entrySet()) {
            doubleCounter += entry.getKey().getCost() * entry.getValue();

        }



        return new Paycheck(mapOfProducts, doubleCounter);
    }

    public String toString() {

        return mapOfProducts + "\n" + doubleCounter;
    }


}
