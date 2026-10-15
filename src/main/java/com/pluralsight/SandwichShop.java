package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {

        double regPrice1 = 5.45;
        double largePrice2 = 8.95;


        Scanner input = new Scanner(System.in);
        System.out.print("Would you like a regular or large? ");
        int type = input.nextInt();
        System.out.print("How old are you? ");
        int age = input.nextInt();



        /*if (age <= 17) {
            basePrice = regPrice1 * .9;
            basePrice = largePrice2 * 9;

        }*/




    }
}
