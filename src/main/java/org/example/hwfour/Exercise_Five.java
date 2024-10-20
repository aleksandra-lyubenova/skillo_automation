package main.java.org.example.hwfour;

import java.util.Scanner;

public class Exercise_Five {
    public static void main(String[] args) {

        //5. Write a program which advices the user where to go to a vacation based on the type of the
        //vacation and the budget. There should be two options – Beach, Mountain. If the user put a
        //different value then the program should print a message that there is no information about this
        //type of vacation. Budgets are considered per day per person. If the budget per day for Beach
        //type vacation is smaller than 50 then the program should advise Bulgaria as a destination,
        //otherwise Outside Bulgaria. If the budget per day for Mountain type vacation is smaller than 30
        //then the program should advise Bulgaria as a destination, otherwise Outside Bulgaria.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a type of vacation");
        String vacation = scanner.nextLine();
        if (!vacation.equalsIgnoreCase("Beach") && !vacation.equalsIgnoreCase("Mountain")) {
            System.out.println("There is no information about this type of vacation.");
        } else {
            System.out.println("Enter a budget");
            double budget = scanner.nextDouble();
            if (vacation.equalsIgnoreCase("Beach")) {
                if (budget < 50) {
                    System.out.println("Our advice: Bulgaria");
                } else System.out.println("Our advice: Outside Bulgaria");
            } else if (vacation.equalsIgnoreCase("Mountain")) {
                if (budget < 30) {
                    System.out.println("Our advice: Bulgaria");
                } else {
                    System.out.println("Our advice: Outside Bulgaria");
                }
            }
        }
    }
}

