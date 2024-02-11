package practice_tasks.java_day10_wrapper_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,3,3,4,4,5,6,7));

        ArrayList<Integer> noDuplicates = new ArrayList<>();

        for (Integer i : list) {
            if(!noDuplicates.contains(i)){
                noDuplicates.add(i);
            }
        }
        System.out.println(noDuplicates);
    }
}
/*
8. Create a class called RemoveDuplicates and write a program with the following specifications:
   8.1 Given an ArrayList of integers, remove duplicated numbers.

			Example:
				list = [1,1,2,2,3,3,4,4,5,6,7]

			Output:
				[1,2,3,4,5,6,7]

 */