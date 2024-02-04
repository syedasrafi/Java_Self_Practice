package practice_tasks.java_day07_class_objects;
import java.util.Scanner;
public class Circle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the circle:");
        double radius = input.nextDouble();

        System.out.println("The area of the circle: " + (3.14*radius*radius));
        System.out.println("The perimeter of the circle: " + (2*(3.14*radius)));

    }

}
/*
Scanner Tasks
6. Create a class named Circle and write a program that asks the user to enter the radius of the Circle and calculate
the area and perimeter of the Circle.

        Example:
             Enter the radius:
             Input: 5

        Output:
             The area of the Circle is 78.5
             The perimeter of the Circle is 31.4


 */