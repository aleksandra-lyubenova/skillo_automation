package main.java.org.example.hwfour;

import java.util.Scanner;

public class Exercise_Seven {
    public static void main(String[] args) {

        //7. Write a program that converts temperature between Celsius and
        //Fahrenheit. The user should be able to choose the direction of conversion.
        //The program should prompt the user to enter a temperature and then ask if
        //they want to convert from Celsius to Fahrenheit or Fahrenheit to Celsius.
        //Perform the conversion based on the user's choice and print the result.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a temperature:");
        double temperature = scanner.nextDouble();
        System.out.println("Please, select direction of conversion: 1 for Celsius to Fahrenheit" +
                " and 2 for Fahrenheit to Celsius");
        int conversion = scanner.nextInt();
        if (conversion == 1){
            double celsius = (temperature * 9/5)+32;
            System.out.println((temperature * 9/5)+32 + "\u00B0F");
        } else if (conversion == 2) {
            System.out.println((temperature - 32) * 5/9 + "\u00B0C");
        } else {
            System.out.println("Incorrect selection.");
        }
    }
}
