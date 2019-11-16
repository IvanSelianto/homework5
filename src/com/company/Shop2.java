package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Shop2 implements Shop {
    private Map<Product, Integer> mapOfProducts = new HashMap();
    private int counter;
    private double doubleCounter;

    public Shop2() {

    }

    public Shop2(Map mapOfProducts, double doubleCounter) {
        this.mapOfProducts = mapOfProducts;
        this.doubleCounter = doubleCounter;
    }

    public Map<Product, Integer> getMapOfProducts() {
        return mapOfProducts;
    }

    public void setMapOfProducts(Map<Product, Integer> mapOfProducts) {
        this.mapOfProducts = mapOfProducts;
    }

    public String toString() {

        return mapOfProducts + "\n" + Double.toString(doubleCounter);
    }


    public Map addProduct(Product product) {
        if (mapOfProducts.containsKey(product)) {
            counter++;
        } else {
            counter = 1;
        }
        mapOfProducts.put(product, counter);


        return mapOfProducts;
    }

    public Shop1 getCheck() {
        mapOfProducts.keySet();
        for (Map.Entry<Product, Integer> entry :
                mapOfProducts.entrySet()) {
            doubleCounter += entry.getKey().getCost() * entry.getValue();

        }

        Shop1 shop2 = new Shop1(mapOfProducts, doubleCounter);

return shop2;
    }
}
