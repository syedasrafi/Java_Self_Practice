package practice_tasks.java_day09_arrays;
import java.util.Arrays;
public class ReverseArray {
    public static void main(String[] args) {

        int [] array = {1,2,3,4,5};

        int [] reverse = array;


        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(reverse[i] + ",");
        }

    }
}
/*
8. Create a class named ReverseArray and write a program to reverse an array of integers and return it as a new one.

			Example:
				array = {1,2,3,4,5};

			Output:
				reversedArray = {5,4,3,2,1};

 */