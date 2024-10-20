package main.java.org.example.hwfour;

import java.util.Scanner;

public class Exercise_Six {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 6. Write a program that asks the user to enter a year. Check if the year is a leap
//year. A year is a leap year if it is divisible by 4 but not divisible by 100, except
//when it is divisible by 400. Print "Leap year" or "Not a leap year" based on the
//result. Hint: A leap year must be divisible by 4, and not divisible by 100 unless is
//divisible by 400.
        System.out.println("Write some year, please.");
        int year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                System.out.println("Year is leap (if).");
            } else if (year % 400 == 0) {
                System.out.println("Year is leap (else if).");
            } else {
                System.out.println("It is not a leap year (inner else).");
            }
        } else {
            System.out.println("It is not a leap year.");
        }

    }
}
