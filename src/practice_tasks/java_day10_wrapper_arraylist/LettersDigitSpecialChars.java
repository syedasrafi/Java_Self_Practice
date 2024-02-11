package practice_tasks.java_day10_wrapper_arraylist;
import java.util.ArrayList;
public class LettersDigitSpecialChars {
    public static void main(String[] args) {
        String str = "Wooden Spoon123!";
        String letter = "",
                digit = "",
                specialCh = "";

        for (char each : str.toCharArray()){
            if(Character.isDigit(each)){
                digit += each;
            }else if (Character.isLetter(each)){
                letter += each;
            }else{
                specialCh += each;
            }

        }
        System.out.println("Letters= " + letter + "\nDigit= " + digit + "\nSpecialChars= " + specialCh);



    }
}
/*
1. Create a class called LettersDigitsSpecialChars and write a program with the following specifications:
   1.1 Given a string, retrieve and display the letters, digits, and special characters separately.
   Example:

	        Example:
	            str = "Wooden Spoon123!"

	        output:
	            letters= "WoodenSpoon";
	            Digits = "123";
	            specialChars = " !";


 */