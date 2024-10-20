package main.java.org.example.hwfour;

import java.util.Scanner;

public class Exercise_One {
    public static void main(String[] args) {
        //1. Write a program which calculates if a triangle can be built by 3 given angles. The
        //angles are taken from the user input. There are two possible outputs – if the triangle
        //can’t be built based on the angle values or the triangle can be built based on the angle
        //values. If the triangle is possible the output should contain also the type of the triangle
        //– acute (остроъгълен), right-angled (правоъгълен), obtuse (тъпоъгълен), equilateral
        //(равностранен), isosceles (равнобедрен), multifaceted (разностранен).

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the first angle, please.");
        int angleOne = scanner.nextInt();
        System.out.println("Write the second angle, please.");
        int angleTwo = scanner.nextInt();
        System.out.println("Write the third angle, please.");
        int angleThree = scanner.nextInt();
        if (angleOne + angleTwo + angleThree == 180) {
            System.out.println("This is a triangle.");
            if (angleOne == angleTwo && angleTwo == angleThree) {
                System.out.println("And it is an equilateral triangle.");
            }
            if (angleOne != angleTwo && angleTwo != angleThree && angleOne != angleThree) {
                System.out.println("And it is an multifaceted triangle.");
            }
            if (angleOne == 90 || angleTwo == 90 || angleThree == 90) {
                System.out.println("And it is a right-angled triangle.");
            }
        } else System.out.println("This is not a triangle.");


    }
}

