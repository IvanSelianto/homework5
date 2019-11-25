package com.company;

import java.io.*;


public class Main {

    public static void main(String[] args) {

        Product mouse = new Mouse("Bloody", 1, 20.45);
        Product mouseTwo = new Mouse("A4Tech", 2, 20);
        Product keyboard = new Keybord("Lenovo", 4, 50);

        Shop1 amazon = new Shop1();
        Shop2 onliner = new Shop2();




        amazon.addProduct(mouse);
        amazon.addProduct(mouse);
        amazon.addProduct(mouse);
        amazon.addProduct(mouseTwo);
        amazon.addProduct(mouseTwo);
        amazon.addProduct(keyboard);

        Buyer Vanya = new Buyer();
        Vanya.buy(2, amazon);
        Vanya.buy(2, amazon);
        Vanya.buy(2, amazon);



        System.out.println(amazon.getCheck(Vanya));
        onliner.addProduct(mouse);
        onliner.addProduct(mouseTwo);

        onliner.addProduct(mouse);
        onliner.addProduct(keyboard);
        onliner.addProduct(keyboard);
        onliner.addProduct(keyboard);
        Vanya.buy(4,onliner);
        Vanya.buy(4,onliner);
        Vanya.buy(4,onliner);
        System.out.println(onliner.getCheck(Vanya));

    /*    FileReader fileReader = new FileReader("text.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String productString = bufferedReader.readLine();
        String[] split = productString.split(",");



        FileWriter fileWriter = new FileWriter("text.csv", true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.append();
        bufferedWriter.close();



        do{
          s = bufferedReader.readLine();
            System.out.println(s);
        }
       while(s!= null); */


        // write your code here
    }
}
