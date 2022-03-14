package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Simple_Calculator {

    public static void main(String[] args) throws IOException {

        float secondNumberElton, sum, subtraction, product, quotient;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("The program calculates sum , difference , product and quotient for two numbers.");
        System.out.println("Enter the first number(and press Enter): ");
        float firstNumberElton = Float.parseFloat(br.readLine());
        System.out.println("Enter the second number (and press Enter): ");
        secondNumberElton= Float.parseFloat(br.readLine());

        sum = firstNumberElton + secondNumberElton;
        subtraction = firstNumberElton - secondNumberElton;
        product = firstNumberElton * secondNumberElton;
        quotient = firstNumberElton / secondNumberElton;

        System.out.printf("You've entered two numbers , the first is : " + "%2.2f", firstNumberElton);
        System.out.printf(" and the Second number is: " + "%2.2f", secondNumberElton);


        System.out.println(); //blank area

        System.out.printf("Sum = " + "%2.2f, \n", +sum);
        System.out.printf("Difference = " + "%2.2f, \n", +subtraction);
        System.out.printf("Product = " + "%2.2f, \n", +product);
        System.out.printf("Quotient = " + "%2.2f, \n", +quotient);

    }
}
