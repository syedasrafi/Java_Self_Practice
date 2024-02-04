package practice_tasks.java_day05_loops;

public class SumOfNumbers {
    public static void main(String[] args) {

    int sumOfNumber = 0;
    int num = 50;

        for (int i = 1; i <= num ; i++) {
            sumOfNumber += i;

        }
        System.out.println(sumOfNumber);


    }
}
/*
4. Create a class named SumOfNumbers and write a program to calculate the sum of all numbers between 1 and any given number.

				Example 1:
					   number = 100

				Output:
					  5050


				Example 2:
					    number = 50

				Output:
					  1275

 */