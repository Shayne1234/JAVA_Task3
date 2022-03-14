package com.company;

public class Even_Numbers {

    public static void main(String[] args) {

        int number =100, i;
        System.out.println( "sum_of_even_numbers between 1-100");

        for(i=1;i<=100;i++){

            if(i%2==0){
                number+=i;

            }

        }
        System.out.println( "Sum of even number is:" +number);




    }
}

