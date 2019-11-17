package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Shop1 implements Shop{
    private List<Product> productList = new ArrayList<>();
    private Map<String, Integer> check = new HashMap();
    private int intCounter;
    private double doubleCounter;
    public Shop1(Map check, double doubleCounter){
        this.check = check;
        this.doubleCounter =doubleCounter;
    }
    public Shop1(){
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public void setCheck(Map<String, Integer> check) {
        this.check = check;
    }

    public int getIntCounter() {
        return intCounter;
    }

    public void setIntCounter(int intCounter) {
        this.intCounter = intCounter;
    }

    public double getDoubleCounter() {
        return doubleCounter;
    }

    public void setDoubleCounter(double doubleCounter) {
        this.doubleCounter = doubleCounter;
    }

    public String toString() {

        return check+"\n"+Double.toString(doubleCounter);
    }

    public void addProduct(Product product){
        productList.add(product);

    }


    public Shop1 getCheck(){
        for (int i = 0; i < productList.size(); i++) {
            for (int j = 0; j < productList.size(); j++) {
                if (productList.get(i).getName().equals(productList.get(j).getName())) {
                    intCounter++;
                }
            }
            check.put(productList.get(i).getName(), intCounter);

            intCounter = 0;
        }

        totalAmount();
        Shop1 shop1 = new Shop1(check, doubleCounter);
        return shop1;



    }
    private double totalAmount(){
        for (int i = 0; i < productList.size() ; i++) {
            doubleCounter+= productList.get(i).getCost();

        }
        return  doubleCounter;
    }



}
