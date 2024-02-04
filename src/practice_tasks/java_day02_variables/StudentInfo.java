package practice_tasks.java_day02_variables;

public class StudentInfo {
    public static void main(String[] args) {

        String studentName = "Josh Steven",
                gender = "Male",
                schoolName = "MIT",
                studentId = "A125",
                gradeLevel = "Undergraduate";
        int age = 22;
        double gpa = 2.8;

        System.out.println("The student's name is " + studentName);
        System.out.println("Gender is " + gender);
        System.out.println("Age is " + age + " years old");
        System.out.println("The school's name is " + schoolName);
        System.out.println("Grade level is " + gradeLevel);
        System.out.println(studentName + "'s GPA is " + gpa);




    }
}

/*
3. Create a class named StudentInfo and write a program with the following requirements:

	Declare the following variables with appropriate data types:
			studentName
			age
			gender
			schoolName
			studentId
			gradeLevel
			gpa

	Display the full student information in the following format:

			Example:
				studentName = "Josh Steven";
				age = 22;
				gender = "Male";
				gpa = 2.8;
				schoolName = "MIT";
				gradeLevel = "Undergraduate";
				studentId = "A125";

			Output:
				The student's name is Josh Steven
				Gender is Male
				Age is 22 years old
				The school's name is MIT
				Grade level is Undergraduate
				Josh Steven's GPA is 2.8
 */