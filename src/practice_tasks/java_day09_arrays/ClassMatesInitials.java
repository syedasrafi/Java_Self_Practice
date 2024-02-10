package practice_tasks.java_day09_arrays;

public class ClassMatesInitials {
    public static void main(String[] args) {

        String [] classMates = {"Syed Asrafi", "Aaa Bbb", "Ccc Ddd", "dgfg fgsg", "fsg gdsgr", "dgd dgrg", "drfrf frg", "rgr frg",
        "dfgg frgtg", "fthg gtgh"};

        for (int i = 0; i < classMates.length; i++) {
            String initials = classMates[i].charAt(0)+"."+classMates[i].charAt(classMates[i].indexOf(" ")+1);
            System.out.println(initials.toUpperCase());
        }


    }
}
/*
2. Create a class named ClassMatesInitials and write a program with the following specifications:
   2.1 Create an array of strings named classmates.
   2.2 Store full names of 10 classmates.
   2.3 Print the initials of each student's name in separate lines.

 */