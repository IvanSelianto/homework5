package com.company;

public class Main {

    public static void main(String[] args) {

        Product mouse = new Mouse("Bloody", 1,20.45);
        Product mouseTwo = new Mouse("A4Tech", 2,20);
        Product keyboard = new Keybord("Lenovo", 4,50);

        Shop1 amazon = new Shop1();
        Shop2 onliner = new Shop2();

        Buyer Vanya = new Buyer();




        amazon.addProduct(mouse);
        amazon.addProduct(mouse);
        amazon.addProduct(mouseTwo);
        amazon.addProduct(keyboard);
        amazon.addProduct(keyboard);
        Vanya.buy(2,amazon);
        System.out.println(Vanya.getMapOfShoppingCart());



        onliner.addProduct(mouse);
        onliner.addProduct(mouseTwo);

        onliner.addProduct(mouse);
        onliner.addProduct(keyboard);
        onliner.addProduct(keyboard);
        onliner.addProduct(keyboard);







	// write your code here
    }
}
