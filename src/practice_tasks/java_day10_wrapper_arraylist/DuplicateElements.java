package practice_tasks.java_day10_wrapper_arraylist;
import java.util.Arrays;
import java.util.ArrayList;

public class DuplicateElements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.addAll(Arrays.asList(1,2,3,4,5));
        list.addAll(list);
        System.out.println(list);
    }
}
/*
3. Create a class called DuplicateElements and write a program with the following specifications:
   3.1 Given an ArrayList, duplicate each element in the list.

		 	Example:
                list = [1,2,3,4,5];

            output:
            	[1,2,3,4,5,1,2,3,4,5];
 */