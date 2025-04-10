package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BasicCalc {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number:");
            float number1 = scanner.nextFloat();
        System.out.print("Enter the second number:");
            float number2 = scanner.nextFloat();
        System.out.println("calculations");

        System.out.println("(A)dd");

        System.out.println("(S)ubtract");

        System.out.println("(M)ultiply");

        System.out.println("(D)ivide");

        System.out.println("Choose an option:");


        String choice =scanner.next();
        float result = number1 * number2 ;
        System.out.printf("%.2f * %.2f = %.2f\n",number1,number2, result);





    }
}
