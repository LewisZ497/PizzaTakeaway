package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        boolean correctSize = false;
        String[] pizzaSizes = {"small", "medium", "large"};
        double[] pizzaPrices = {7.99, 10.99, 13.99};
        String size;
        int indexOfSize = 0;
        while(!correctSize) {
            System.out.println("What size pizza do you want? You can choose small, medium or large.");
            size = input.next();
            for (int i = 0; i < pizzaSizes.length; i++) {
                if(pizzaSizes[i].equalsIgnoreCase(size)) {
                    indexOfSize = i;
                    correctSize = true;
                }
            }
        }
        double price = pizzaPrices[indexOfSize];
        ArrayList<String> toppings = new ArrayList<>();
        boolean end = false;
        while(!end) {
            System.out.println("Please enter the toppings that you want, one by one");
            String topping = input.next();
            if(topping.equalsIgnoreCase("end")) {
                end = true;
            } else {
                toppings.add(topping);
            }
        }
        if(toppings.size() > 2) {
            price += (toppings.size() - 2) * 1.25;
        }
        System.out.println("Your toppings are " + toppings + ", and the price is £" + (double) Math.round(price * 100) / 100);
    }
}
