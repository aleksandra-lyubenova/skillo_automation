package Operators_expressions_stetements;

import java.util.Scanner;

public class Exercise_Two {
    public static void main(String[] args) {


        /*2. Write a program to print the days of the week based on the user digit 1-7
input. The message should be “The [user input digit]-st/nd/rd/th day of the
week is [the day of the week]”*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a day, please.");
        int weekDay = scanner.nextInt();
        switch (weekDay) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Monday");
                break;
            default:
                System.out.println("Wrong number");
        }
    }
}
