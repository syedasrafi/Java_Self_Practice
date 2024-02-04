package practice_tasks.java_day04_selection_statements;

public class ChooseLanguage {
    public static void main(String[] args) {

        int selection = '3';

        switch (selection){
            case '1' :
                System.out.println("Hello, thank you for your call");
                break;
            case '2':
                System.out.println("Hola, gracias por llamar");
                break;
            case '3':
                System.out.println("Merhaba, aradığınız için teşekkürler");
                break;
            case '4':
                System.out.println("Привет, спасибо за ваш звонок");
                break;
            case '5':
                System.out.println("Merci, pour votre appel");
                break;
        }

        }


    }

/*
USE IF STATEMENTS TO COMPLETE THE FOLLOWING TASKS:
1. Create a class named ChooseLanguage. Given an integer variable named selection that has a
number between 1~5, write a program that selects the language based on the number provided in
the selection and prints the following message:

		for 1: Hello, thank you for your call
		for 2: Hola, gracias por llamar
		for 3: Merhaba, aradığınız için teşekkürler
		for 4: Привет, спасибо за ваш звонок
		for 5: Merci, pour votre appel

			Example:
				   selection = 3;

			Output:
				  Merhaba, aradiginiz icin tesekkurler

 */