package practice_tasks.java_day04_selection_statements;

public class MedianNumber {
    public static void main(String[] args) {

        int a = 10, b = 15, c = 20;
        int numOfIntegers = 3;
        int median = (a + b + c)/(numOfIntegers);

        System.out.println(median + " is the median number");


    }
}

/*
USE IF STATEMENTS TO COMPLETE THE FOLLOWING TASKS:
4. Create a class named MedianNumber. Write a program that finds the median number between
three DIFFERENT given integers (Assume that the given three integers are distinct numbers).

			Example:
				   a = 10;
				   b = 15;
				   c = 20;

			Output:
				  15 is the median number
 */