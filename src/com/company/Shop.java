package com.company;


import java.util.List;
import java.util.Map;

public interface Shop {

    void addProduct(Product product);

    Paycheck getCheck(Buyer buyer);
    Map<Product,Integer> giveProduct(long id);



}
