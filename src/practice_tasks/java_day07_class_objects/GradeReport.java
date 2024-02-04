package practice_tasks.java_day07_class_objects;
import java.util.Scanner;
public class GradeReport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score: ");
        int grade = input.nextInt();

        System.out.println((grade < 0 || grade > 100)? "Invalid score" : (grade >90)?
                "Your grade is A" : (grade >80)? "Your grade is B" : (grade >70)?
                "Your grade is C" : (grade>60)? "Your grade is D": "Your grade is F");
    }
}
/*
Scanner Tasks
7. Create a class named GradeReport and write a program asking the user to enter their score and print the student's grade.

  If the user enters an invalid score (negative or more than 100), print "Invalid Score."

        Example:
             Enter your score:
             Input: 85

        Output:
             Your grade is B

 */