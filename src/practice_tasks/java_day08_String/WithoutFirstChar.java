package practice_tasks.java_day08_String;

import java.util.Scanner;

public class WithoutFirstChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word");
        String word1 = input.nextLine();

        System.out.println("Enter second word");
        String word2 = input.nextLine();
        input.close();

        word1 = word1.substring(1);
        word2 = word2.substring(1);
        System.out.println(word1+word2);



    }

}
/*
STRING TASKS
2. Create a class named WithoutFirstChar. Ask the user to enter two words. Print the first word without its
first character, then print the second word without its first character.

        Example:
              Inputs:
                  apple
                  banana

              Output:
                   ppleanana

 */