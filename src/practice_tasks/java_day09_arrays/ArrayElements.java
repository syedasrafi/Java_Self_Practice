package practice_tasks.java_day09_arrays;

import java.util.Arrays;

public class ArrayElements {
    public static void main(String[] args) {

    //1.1 Create an array of integers with a length of 100.
        int [] integers = new int[100];

    //1.2 Assign values from 1 to 100 to the indexes of the array.
        for (int i = 0; i < integers.length; i++) {
            integers[i] =i + 1;
        }
    //1.3 Display the array elements in a single line separated by spaces.
        for (int integer : integers) {
            System.out.print(integer + " ");
        }
        System.out.println();
    //1.4 Display the array elements in a single line in reversed order, separated by spaces.
        int [] reverseArray = new int[integers.length];
        for (int i = reverseArray.length ; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    //1.5 Display all evenly divisible elements by 5 in a single line separated by spaces.
        for (int i = 0; i < integers.length; i++) {
            if(integers[i] % 5 == 1){
                System.out.print(i + " ");
            }
        }

    }

}


/*
1. Create a class named ArrayElements and write a program with the following specifications:
   1.1 Create an array of integers with a length of 100.
   1.2 Assign values from 1 to 100 to the indexes of the array.
   1.3 Display the array elements in a single line separated by spaces.
   1.4 Display the array elements in a single line in reversed order, separated by spaces.
   1.5 Display all evenly divisible elements by 5 in a single line separated by spaces.
 */