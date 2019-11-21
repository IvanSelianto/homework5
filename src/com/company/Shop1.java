package com.company;

import java.util.*;

public class Shop1 implements Shop {
    private List<Product> productList = new ArrayList<>();
    private Map<Product, Integer>  storageMap = new HashMap();
    private int intCounter;



    public Shop1() {
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {

        this.productList = productList;
    }

    public void setCheck(Map<Product, Integer> check) {
        this.storageMap = check;
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

    }


    public Paycheck getCheck(List<Long> id) {
        Paycheck paycheck = new Paycheck();

        paycheck.put(storageMap);

        return paycheck;


    }

    public Map<Product, Integer> getStorageMap() {


        for (int i = 0; i < productList.size(); i++) {
            for (int j = 0; j < productList.size(); j++) {
                if (productList.get(i).getName().equals(productList.get(j).getName())) {
                    intCounter++;
                }
            }
            storageMap.put(productList.get(i), intCounter);


            intCounter = 0;
        }
        return storageMap;
    }



}
