package com.imaks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Temperature Converter");
        System.out.println("V0.1");

        Scanner scanner = new Scanner(System.in);

        while (true){

            System.out.println("Please choose an option:");
            System.out.println("Press 1 to convert °F to °C");
            System.out.println("Press 2 to convert °C to °F");
            System.out.println("Press 0 to stop the app");

            int option;
            try {
                option = scanner.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Error. Please press 1, 2 or 0");
                scanner.next();
                continue;
            }
                if (option != 1 && option != 2 && option != 0) {
                    System.out.println("Please press 1, 2 or 0");
                    continue;
                } else if (option == 0) {
                    break;
                }


            double degrees;
            try {
            System.out.println("Enter number of degrees:");
            degrees = scanner.nextDouble();

                if (degrees < -Double.MAX_VALUE || degrees > Double.MAX_VALUE) {
                    System.out.println("The entered number of degrees is out of range, try again");
                    continue;
                }
            }catch (InputMismatchException e) {
                System.out.println("Error. Not a number entered! Please enter a number");
                scanner.next();
                continue;
            }

            switch (option){
                case 1:
                    double celsius = fahrenheitToCelsius(degrees);
                    System.out.println(degrees + " °F = " + celsius + " °C");
                    break;

                case 2:
                    double fahrenheit = celsiusToFahrenheits(degrees);
                    System.out.println(degrees + " °C = " + fahrenheit + " °F");
                    break;

            }


        }

    }

//The conversion formula from Fahrenheits to Celsius is (°F) - 32) * 5/9.
public static double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5/9;
}

//The conversion formula from Celsius to Fahrenheits is (°C × 9/5) + 32.
public static double celsiusToFahrenheits(double celsius){
        return (celsius * 9/5) + 32;
}
}
