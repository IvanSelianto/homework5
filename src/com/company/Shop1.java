package com.company;

import java.util.*;

public class Shop1 implements Shop {
    private List<Product> productList = new ArrayList<>();
    private Map<Product, Integer> storageMap = new HashMap();
    private Map<Long, Product> mapOfId = new HashMap<>();
    private Map<Product, Integer> mapOfShoppingCart = new HashMap<>();
    private int intCounter;


    public Shop1() {
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop1 shop1 = (Shop1) o;
        return Objects.equals(storageMap, shop1.storageMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storageMap);
    }


    public void addProduct(Product product) {
        productList.add(product);
        intCounter = 0;

        if (mapOfId.containsKey(product)) {
            intCounter++;
        } else {
            intCounter = 1;
        }
        mapOfId.put(product.getId(), product);


        for (int i = 0; i < productList.size(); i++) {
            for (int j = 0; j < productList.size(); j++) {
                if (productList.get(i).getName().equals(productList.get(j).getName())) {
                    intCounter++;
                }
            }
            storageMap.put(productList.get(i), intCounter);


            intCounter = 0;
        }


    }


    public Paycheck getCheck(Buyer buyer) {

        Paycheck paycheck = new Paycheck();

        paycheck.put(buyer.getMapOfShoppingCart());

        return paycheck;


    }

    public Map<Product, Integer> getStorageMap() {
        return storageMap;
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
