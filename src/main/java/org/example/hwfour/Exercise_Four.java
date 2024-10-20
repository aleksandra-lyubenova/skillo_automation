package main.java.org.example.hwfour;

import java.util.Scanner;

public class Exercise_Four {
    public static void main(String[] args) {

        //4. Write a Java program to calculate the revenue from a sale based on the unit price and
        //quantity of a product input by the user. The discount rate is 15% for the quantity
        //purchased between 100 and 120 units, and 20% for the quantity purchased greater than
        //120 units. If the quantity purchased is less than 100 units, the discount rate is 0%.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter unit price:");
        double price = scanner.nextDouble();
        System.out.println("Enter quantity:");
        double quantity = scanner.nextDouble();
        double discount15 = 0.15;
        double discount20 = 0.20;
        double amount = price * quantity;
        if (quantity < 100) {
            System.out.println("The revenue from sale: " + quantity * price + "$\nDiscount: " + "0$");
        }
        else if (quantity >= 100 && quantity <= 120) {
            double totalDiscount = amount * discount15;
            double totalAmount = amount - totalDiscount;
            System.out.printf("The revenue from sale: " + totalAmount + "$\nDiscount: " + totalDiscount + "$");
        }
        else {
            double totalDiscount = amount * discount20;
            double totalAmount = amount - totalDiscount;
            System.out.printf("The revenue from sale: " + totalAmount + "$\nDiscount: " + totalDiscount + "$");
        }

    }
}
