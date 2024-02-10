package practice_tasks.java_day09_arrays;

import java.util.Arrays;

public class ClassMatesReversed {
    public static void main(String[] args) {

        String [] classMates = {"Syed Asrafi", "Aaa Bbb", "Ccc Ddd", "dgfg fgsg", "fsg gdsgr", "dgd dgrg", "drfrf frg", "rgr frg",
                "dfgg frgtg", "fthg gtgh"};

        String[] reverseName = new String[classMates.length];

        for (int i = classMates.length - 1,j = 0; i >= 0; i--, j++) {
            reverseName[j] = classMates[i];
        }
        System.out.print(Arrays.toString(reverseName));

    }
}
/*
6. Create a class named ClassMatesReversed and write a program with the following specifications:
   6.1 Create an array of strings named classmates.
   6.2 Store full names of 10 classmates.
   6.3 Reverse each student's name and print them on separate lines.
 */