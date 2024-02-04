package practice_tasks.java_day04_selection_statements;

public class GradeLevel {
    public static void main(String[] args) {

        byte gradeLevel = 8;

        String schoolType = (gradeLevel>0 && gradeLevel<6)?"Elementary school":(gradeLevel<9)?"Middle school":
                (gradeLevel<13)?"High school":(gradeLevel<17)?"College":(gradeLevel<19)?"Grad school":
                        "Invalid grade level";


        System.out.println(schoolType);

    }
}

/*
USE IF STATEMENTS TO COMPLETE THE FOLLOWING TASKS:
6. Create a class called GradeLevel. Given a number (byte) gradeLevel, determine and print which
	school type someone is in. The grade levels and types are:

		1-5: Elementary school
		6-8: Middle school
		9-12: High school
		13-16: College
		17-18: Grad School
		For any other grade level, print "Invalid grade level."

			Example:
				   gradeLevel = 8

			Output:
				  Middle school
 */