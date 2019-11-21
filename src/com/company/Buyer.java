package com.company;


import java.util.HashMap;

import java.util.Map;
import java.util.Objects;

public class Buyer {
    Map<Product, Integer> mapOfShoppingCart = new HashMap<>();

    public Map<Product, Integer> getMapOfShoppingCart() {
        return mapOfShoppingCart;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Buyer buyer = (Buyer) o;
        return Objects.equals(mapOfShoppingCart, buyer.mapOfShoppingCart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mapOfShoppingCart);
    }

    public void buy(int id, Shop shop) {
        int counter=1;

        Shop1 shop1 = new Shop1();
        for (int i = 0; i <shop1.getProductList().size() ; i++) {
            if(shop1.getProductList().get(i).getId()== id){
                mapOfShoppingCart.put(shop1.getProductList().get(i), counter);
                counter++;
            }
        }









   /*     for (int i = 0; i < mapOfShoppingCart.size(); i++) {
            for (int j = 0; j < mapOfShoppingCart.size(); j++) {
                if (mapOfShoppingCart.get(i).getName().equals(mapOfShoppingCart.get(j).getName())) {
                    intCounter++;
                }
            }
            storageMap.put(mapOfShoppingCart.get(i), intCounter);

            intCounter = 0;
        }*/


    }
}
