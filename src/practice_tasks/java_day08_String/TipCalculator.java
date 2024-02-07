package practice_tasks.java_day08_String;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Split or No split (Yes or No)");
        String split = input.next();
        System.out.println("Enter the number of people:");
        int people = input.nextInt();
        System.out.println("Enter the check amount:");
        double check = input.nextDouble();
        System.out.println("Service Quality:");
        String serviceQuality = input.next();
        input.close();
        double tip = 0;

        if (serviceQuality.equalsIgnoreCase("poor")){
            tip =check*.05;
        }else if(serviceQuality.equalsIgnoreCase("fair")){
            tip =check*.10;
        }else if(serviceQuality.equalsIgnoreCase("good")){
            tip =check*.15;
        }else if(serviceQuality.equalsIgnoreCase("great")){
            tip =check*.20;
        }else if(serviceQuality.equalsIgnoreCase("excellent")){
            tip =check*.25;
        }else{
            System.out.println("Invalid entry");
        }

        double totalToPay = (tip)+(check);
        double totalPerPerson = totalToPay/people;
        double tipPerPerson = tip/people;

        System.out.println("Number of people entered: " + people + "\nTotal to pay: " + totalToPay +
                "\nTotal tip: " + tip + "\nTotal per person: " + totalPerPerson +
                "\nTip per person: " + tipPerPerson);

    }

}
/*
STRING TASKS
7. Create a class called TipCalculator and write a program for a tip calculator. There will be different service
quality benchmarks that will determine the tip given. There will also be the ability to calculate based on the
number of people in the party and whether there is a split of the bill.

        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

      The program should ask the user to enter:
          - Split or No split (Yes or No),
          - Enter the number of people (number)
          - Enter the check amount (number)
          - Service Quality (String)

      And display the output in the following format:

            Example:
                  Split or No Split (Yes or No)?
                  Input: Yes
                  Enter the number of people:
                  Input: 4
                  Enter the check amount:
                  Input: 476
                  How was the service quality? (Excellent/Great/Good/Fair/Poor)
                  Input: Excellent

            Output:
                 Number of people entered: 4
                 Total to pay: 595.0
                 Total tip: 119.0
                 Total per person: 148.75
                 Tip per person: 29.75

 */