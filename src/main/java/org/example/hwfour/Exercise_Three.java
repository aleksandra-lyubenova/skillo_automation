package main.java.org.example.hwfour;

import java.util.Scanner;

public class Exercise_Three {
    public static void main(String[] args) {
        //3. Write Java program to allow the user to input his/her age. Then the program
        //will show if the person is eligible to work. A person who is eligible to work
        //must be older than or equal to 16 years old.

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age >= 16){
            System.out.println("User is eligible to work.");
        } else System.out.println("User is not eligible to work.");
    }
}
