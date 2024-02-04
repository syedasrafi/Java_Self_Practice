package practice_tasks.java_day04_selection_statements;

public class CrewAndPassenger {
    public static void main(String[] args) {

    int number = 75;

    String CrewAndPass = (number==50)?"20 Crew, 30 Passengers":(number==75)?"25 Crew, 50 Passengers":
            (number==100)?"30 Crew, 70 passengers":"Invalid number";
        System.out.println(CrewAndPass);

    }
}

/*
USE IF STATEMENTS TO COMPLETE THE FOLLOWING TASKS:
7. Create a class called CrewAndPassenger. Given the total number of people on the ship,
	determine how many should be crew members and how many can be passengers.

		Total: 50 ====> 20 crew, 30 passengers
		Total: 75 ====> 25 crew, 50 passengers
		Total: 100 ====> 30 crew, 70 passengers
		Any other number of people on the ship is not valid.
		Print how many of each type there should be.

			Example:
				   number = 75

			Output:
				  25 crew, 50 passengers
 */