package practice_tasks.java_day07_class_objects;
import java.util.Scanner;
public class FamilyMembers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many people do you live with?");
        int people = input.nextInt();

        System.out.println( people < 3 ? "Live with less than three people."
                : people <= 6 ? "Live with 3 - 6 people."
                : "Live with more than4 six people."
        );



    }
}

/*
SCANNERS TASKS:
5. Create a class named FamilyMembers and write a program that asks the user how many people they live with.

    If the user lives with fewer than three people, print "Live with less than three people."
    If the user lives with 3 - 6 people, print "Live with 3 - 6 people."
    If the user lives with more than six people, print "Live with more than six people."

        Example:
             How many people do you live with?
             Input: 3

        Output:
             Live with 3 - 6 people.

 */