package practice_tasks.java_day09_arrays;

public class StudentGrade {
    public static void main(String[] args) {

        String[] studentNames = {"Syed Asrafi", "James Watson", "Kiara B"};
        int[] scores = {50,70,89};
        char[] grade = new char[studentNames.length];

        for (int i = 0; i < grade.length; i++) {
            int score = scores[i];
            if(score > 85){
                grade[i] = 'A';
            }else if(score > 75){
                grade[i] = 'B';
            }else{
                grade[i] = 'F';
            }
            System.out.println(studentNames[i] + "'s score is " + score + " and grade is " + grade[i]);
        }



    }
}
/*
4. Create a class named StudentGrade and write a program with the following specifications:
	4.1 Given two arrays with the same length:
		   studentNames (String[])
		   scores (int[])

   	4.2 Write a program to determine and store the students' grades in an array of characters named grades.
    4.3 Print the grade report for each student in separate lines.

			Example:
				String[] names = {"Anna", "Nancy", "Sarah"};
				int[] scores = {90, 75, 80};

			Output:
				grades = {'A', 'C', 'B'};
				Anna's score is 90, and grade is A
				Nancy's score is 75, and grade is C
				Sarah's score is 80, and grade is B
 */