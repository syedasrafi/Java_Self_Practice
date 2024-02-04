package practice_tasks.java_day07_class_objects;

public class EmployeeClients {

    public static void main(String[] args) {


        Employee employee1 = new Employee();
        employee1.name = "Syed";
        employee1.age = 27;
        employee1.gender = 'M';
        employee1.jobTitle = "Cashier";
        employee1.salary = 100_000.00;

        employee1.work();

        System.out.println(employee1);

        Employee employee2 = new Employee();
        employee2.name = "Mr A";
        employee2.age = 55;
        employee2.gender = 'M';
        employee2.jobTitle = "Teacher";
        employee2.salary = 60_000.00;

        employee2.work();

        System.out.println(employee2);




    }

}
/*
CUSTOM CLASS TASKS:
1. Create a class named Employee with the following attributes and actions:

      Attributes:
            name (String): used for storing the name of the employee
            age (int): used for storing the age of the employee
            gender (char): used for storing the gender of the employee
            jobTitle (String): used for storing the job title of the employee
            salary (double): used for storing the job title

      Actions:
            work(): plays the job title and name of the employee concatenated with " is working."

            toString(): returns a string representation of the employee object.

      Create another class named EmployeeClients, create multiple employee objects, and test each function of the employee object.
 */