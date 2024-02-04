package practice_tasks.java_day04_selection_statements;

public class AgeGroups {
    public static void main(String[] args) {

        int age = 42;
        String ageGroup = (age >=0 && age <=20)?"Teenager":(age>=21 && age<=55)?"Adult":(age>=55 && age<150)?
                "Senior":"Invalid";
        System.out.println(ageGroup);


    }
}
/*
USE IF STATEMENTS TO COMPLETE THE FOLLOWING TASKS:
8. Create a class named AgeGroups. An integer variable named age is given.
	Write a program that can determine the age group of a person. The age groups are:

		Teenager (0 ~ 20)
		Adult   (21 ~ 55)
      Senior  (55 or older)

		If the age is negative or greater than 150, print "Invalid."


			Example:
				   age = 42

			Output:
				  Young Middle-Aged Adult

 */