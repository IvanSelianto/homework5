package com.company;

import java.util.HashMap;

import java.util.Map;
import java.util.Objects;

public class Shop2 implements Shop {
    private Map<Product, Integer> storageMap = new HashMap();
    private Map<Long, Product> mapOfId = new HashMap<>();
    private Map<Product, Integer> mapOfShoppingCart = new HashMap<>();
    private int intCounter;

    public Shop2() {

    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop2 shop2 = (Shop2) o;
        return storageMap.equals(shop2.storageMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storageMap);
    }


    public void addProduct(Product product) {
        if (storageMap.containsKey(product)) {
            intCounter++;
        } else {
            intCounter = 1;
        }
        storageMap.put(product, intCounter);

        intCounter = 0;

        if (mapOfId.containsKey(product)) {
            intCounter++;
        } else {
            intCounter = 1;
        }
        mapOfId.put(product.getId(), product);


    }


    public Paycheck getCheck(Buyer buyer) {
        Paycheck paycheck = new Paycheck();

        paycheck.put(buyer.getMapOfShoppingCart());

        return paycheck;
    }

    public Map<Product, Integer> giveProduct(long id) {
        if (storageMap.get(mapOfId.get(id)) == 0) {
            return mapOfShoppingCart;
        }

        mapOfShoppingCart.put(mapOfId.get(id), intCounter);

        if (mapOfShoppingCart.containsKey(mapOfId.get(id))) {
            intCounter++;
        } else {
            intCounter = 1;
        }
        mapOfShoppingCart.put(mapOfId.get(id), intCounter);
        storageMap.put(mapOfId.get(id), storageMap.get(mapOfId.get(id)) - 1);


        return mapOfShoppingCart;
    }

}

