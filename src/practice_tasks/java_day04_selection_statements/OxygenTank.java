package practice_tasks.java_day04_selection_statements;

public class OxygenTank {
    public static void main(String[] args) {

        int oxygenLevel = 75;

        String oxygenLevelResult = (oxygenLevel>=90)?"Your tank is full":(oxygenLevel<90 && oxygenLevel>=80)?
                "Still okay": (oxygenLevel<80 && oxygenLevel>=70)?"Don't go too far":(oxygenLevel<70 && oxygenLevel>=60)?
                "Start to head back": "Be careful, you're at 50%";

        System.out.println(oxygenLevelResult);

        /*
        if (oxygenLevel >= 90){
            System.out.println("Your tank is full");
        }else if(oxygenLevel < 90 && oxygenLevel >=80){
            System.out.println("Still okay");
        }else if(oxygenLevel < 80 && oxygenLevel >=70){
            System.out.println("Don't go too far");
        }else if(oxygenLevel <70 && oxygenLevel >= 60){
            System.out.println("Start to head back");
        }else if(oxygenLevel < 60 && oxygenLevel >=50){
            System.out.println("Be careful, you're at 50%");
        }
        */
        }

    }


/*
USE IF STATEMENTS TO COMPLETE THE FOLLOWING TASKS:
2. Create a class named OxygenTank. You are diving in the ocean. Your oxygen tank has a certain
level (number), and you must print a message based on the level:

		Above 90 - Your tank is full
		Above 80 - Still okay
		Above 70 - Don't go too far
		Above 60 - Start to head back
		Above 50 - Be careful, you're at 50%

			Example:
				   oxygenLevel = 75;

			Output:
				  Don't go too far
 */