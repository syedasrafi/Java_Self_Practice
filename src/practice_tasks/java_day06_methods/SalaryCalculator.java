package practice_tasks.java_day06_methods;

public class SalaryCalculator {
    public static void main(String[] args) {
        System.out.println(salary(45,40));
    }
    public static double salary(double rate, int hours){
        return (rate*hours)*(52);

    }
}
/*
2. Create a class named SalaryCalculator and create a method named salary that takes hourly rate (double)
and weekly hours (int) and returns the salary.

			Example:
				double income = salary(45, 40);

			Output:
				93600.0

 */