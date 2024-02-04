package practice_tasks.java_day04_selection_statements;

import org.w3c.dom.ls.LSOutput;

public class NumberOfDays {
    public static void main(String[] args) {

        String answer;
        int month = 1;

        switch (month) {
            case 1:
                answer = "31 days";
            case 2:
                System.out.println("28 days");
                break;
            case 3:
                System.out.println("31 days");
                break;
            case 4:
                System.out.println("30 days");
                break;
            case 5:
                System.out.println("31 days");
                break;
            case 6:
                System.out.println("30 days");
                break;
            case 7:
                System.out.println("31 days");
                break;
            case 8:
                System.out.println("31 days");
                break;
            case 9:
                System.out.println("30 days");
                break;
            case 10:
                System.out.println("31 days");
                break;
            case 11:
                System.out.println("30 days");
                break;
            case 12:
                System.out.println("31 days");
                break;
            default:
                System.out.println("Invalid");



        }
    }
}
/*
USE SWITCH STATEMENTS TO COMPLETE THE FOLLOWING TASKS:
12. Create a class named NumberOfDays. An integer variable named month is given.
	Write a program to determine the number of days in a given month.

			Example:
				   month = 5

			Output:
				   31 days

			(Assume that February has 28 days)

		If the given month number is not between 1~12, then print "Invalid."

		Hints:
			Months with 31 days: 1, 3, 5, 7, 8, 10, 12
			Months with 30 days: 4, 6, 9, 11

 */