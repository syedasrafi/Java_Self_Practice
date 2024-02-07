package practice_tasks.java_day08_String;

import java.util.Scanner;

public class FirstAndLastNames {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name:");
        String first = input.next();
        System.out.println("Enter last name:");
        String last = input.next();
        input.close();

        String firstName = first.substring(0,1).toUpperCase()+first.substring(1).toLowerCase();
        String lastName = last.substring(0,1).toUpperCase()+last.substring(1).toLowerCase();
        System.out.println(firstName + " " + lastName);
    }

}
/*
STRING TASKS
6. Write a program that asks the user to enter first and last names and then prints the full name in regular format
(first character in uppercase).

        Example:
              Input:
                  firstName = "cyDEo";
                  lastName = "SCHOOL";

              Output:
                   Cydeo School

 */