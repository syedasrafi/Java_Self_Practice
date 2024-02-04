package practice_tasks.java_day04_selection_statements;

public class Grade {
    public static void main(String[] args) {

        char grade = 'B';

        String result = (grade == 'A')?"Excellent":(grade == 'B')?"Great job":(grade
        == 'C')?"Good":(grade == 'D')?"Passed":(grade == 'F')?"Failed":"Invalid Grade";


        System.out.println(result);
    }
}
/*
USE IF STATEMENTS TO COMPLETE THE FOLLOWING TASKS:
5. Create a class called Grade. A char variable named grade is given.
   Write a program to print the following messages:

		'A': Excellent
		'B': Great job
		'C': Good
		'D': Passed
		'F': Failed
		Otherwise: Invalid Grade

			Example:
				   grade = 'B'

			Output:
				  Great job
 */