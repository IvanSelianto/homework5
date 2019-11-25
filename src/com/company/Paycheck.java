package com.company;


import java.util.HashMap;

import java.util.Map;

public class Paycheck {
    private Map<Product, Integer> mapOfShoppingCart = new HashMap<>();
    private double doubleCounter;

    public Paycheck() {


    }

    private Paycheck(Map<Product, Integer> mapOfShoppingCart, double doubleCounter) {
        this.mapOfShoppingCart = mapOfShoppingCart;
        this.doubleCounter = doubleCounter;

    }

    public Paycheck put(Map<Product, Integer> mapOfShoppingCart) {

this.mapOfShoppingCart = mapOfShoppingCart;
        for (Map.Entry<Product, Integer> entry :
                mapOfShoppingCart.entrySet()) {
            doubleCounter += entry.getKey().getCost() * entry.getValue();

        }



        return new Paycheck(mapOfShoppingCart, doubleCounter);
    }

    public String toString() {

        return mapOfShoppingCart + "\n" + doubleCounter;
    }


}
