package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BMICalculator {

    public static void main(String[] args) throws IOException{

        float heightElton , weightElton, bmiElton;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("The Program will calculate your BMI");
        System.out.println("Enter your height in cm (and press Enter): ");
        heightElton = Float.parseFloat(br.readLine())/100;
        System.out.println("Enter your weight in kg (and press Enter): ");
        weightElton = Float.parseFloat(br.readLine());

        bmiElton = (float) (weightElton/ (Math.pow(heightElton, 2)));
        System.out.printf("Your BMI is: " + "%2.2f,  \n", bmiElton);


        if (bmiElton< 16){
            System.out.println("You are slim/skinny/suffering from starvation");
        } else if (bmiElton>= 16 &&(bmiElton < 16.99)){
            System.out.println("You're emaciated");
        }else if ((bmiElton >= 17)&&(bmiElton < 18.49)){
            System.out.println("You're underweight");
        }else if ((bmiElton >= 18.50)&&(bmiElton< 22.99)){
            System.out.println("You're in a low range or the norm");
        }else if ((bmiElton >= 23)&&(bmiElton < 24.99)){
            System.out.println("You're in the high range of the norm");
        }else if ((bmiElton >= 25)&&(bmiElton < 27.49)){
            System.out.println("You're overweight ot pre-obese");
        }else if ((bmiElton >= 27.50)&&(bmiElton < 29.99)){
            System.out.println("You're overweight");
        }else if ((bmiElton >= 30)&&(bmiElton < 34.99)){
            System.out.println("You've 1st degree obesity");
        }else if ((bmiElton >= 35)&&(bmiElton < 39.99)){
            System.out.println("You've 2nd degree obesity");
        }else if ((bmiElton> 40)){
            System.out.println("You've 3rd degree obesity");
        }


    }

}


