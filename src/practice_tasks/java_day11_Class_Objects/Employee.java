package practice_tasks.java_day11_Class_Objects;

public class Employee {

    public String name, jobTitle;
    public int age;
    public double salary;

    public Employee(String name, String jobTitle, int age, double salary){
        this.name = name;
        this.jobTitle = jobTitle;
        this.age = age;
        this.salary = salary;
    }
    public void work(){
        System.out.println(jobTitle + " " + name + " is working.");
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
/*
3. Create a custom class named Employee with the following specifications:

	Attributes:
			name (String)
			age (int)
			gender (char)
			jobTitle (String)
			salary (double)

    Constructors:
			Add multiple constructors to set different fields of the employee object.

    Actions:
		work(): prints the job title and name of the employee concatenated with " is working."
		toString(): returns a string representation of the employee object.

	Create another class named EmployeeClients, create multiple employee objects, and test each function of the employee object.

 */