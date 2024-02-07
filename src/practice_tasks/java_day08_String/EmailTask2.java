package practice_tasks.java_day08_String;

import java.util.Scanner;

public class EmailTask2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your email:");
        String email = input.next();
        input.close();


        String firstName = email.substring(0,1).toUpperCase()+email.substring(1,email.indexOf("_"));

        String lastName = email.substring(email.indexOf("_")+1,email.indexOf("_")+2).toUpperCase()+email.substring(email.indexOf("_")+2,email.indexOf("@"));

        String domain = email.substring(email.indexOf("@")+1,email.indexOf("."));
        //domain = email.substring(email.indexOf("@")+1,email.indexOf("2")+2).toUpperCase()+email.substring(email.indexOf("@")+2);

        System.out.println("First name: " + firstName + "\nLast name: " + lastName + "\nDomain: " + domain);



    }//System.out.println("First name: " + firstName + "\nLast name: " + lastName + "\nDomain: " + domain);
}
/*
STRING TASKS
5. Create a class called EmailTask2. Assume that the email address is constructed by a person's first name followed
by an underscore and last name. Write a program that will print out information about the user based on the email.
Print the first name, last name, and domain. First and last names should be printed with the proper format.
(uppercase first letter and remaining lowercase)

        Example:
              Input:
                 craig_federighi@apple.com

              Output:
                   First name: Craig
                   Last name: Federighi
                   Domain: apple

 */