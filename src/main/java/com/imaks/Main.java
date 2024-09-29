package com.imaks;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Temperature Converter");
        System.out.println("V0.1");

        Scanner scanner = new Scanner(System.in);

        while (true){

            System.out.println("Enter fahrenheit's number to convert to celsius:");
            double fahrenheit = scanner.nextDouble();
            double celsius = fahrenheitToCelsius(fahrenheit);
            System.out.println(fahrenheit + " °F = " + celsius + " °C");

        }

    }

    //The conversion formula from Fahrenheits to Celsius is (°F) - 32) * 5/9.
public static double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5/9;

}
}
