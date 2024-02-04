package practice_tasks.java_day06_methods;

public class MathUtility {
    public static void main(String[] args) {
        int result = calculate(2,'+',2);
        System.out.println(result);

        double resultDouble = calculate(2.2, '+', 2.0);
        System.out.println(resultDouble);

        int resultSquare = square(4);
        System.out.println(resultSquare);

    }

    public static int calculate(int a, char operator, int b){
        if(operator == '+'){
            return a+b;
        }else if(operator == '-'){
            return a-b;
        }else if(operator == '*'){
            return a*b;
        }else if(operator == '/'){
            return a/b;
        }else {
            return 0;
        }
    }

    public static double calculate(double a, char operator, double b){
        if(operator == '+'){
            return a+b;
        }else if(operator == '-'){
            return a-b;
        }else if(operator == '*'){
            return a*b;
        }else if(operator == '/'){
            return a/b;
        }else {
            return 0;
        }
    }

    public static int square(int a){
        return a*a;
    }

    public static double square(double a){
        return a*a;
    }

    public static int cube(int a){
        return a*a*a;
    }

    public static double cube(double a){
        return a*a*a;
    }

}
/*
5. Create a class named MathUtility:

	5.1 Create a method named calculate that takes three arguments (Two integers and a char) and returns the result based on the operator.

		If the operator is +:
			The method should return the addition of the two numbers

		If the operator is -:
			The method should return the subtraction of the two numbers

		If the operator is *:
			The method should return the multiplication of the two numbers

		If the operator is /:
			The method should return the multiplication of the two numbers

	for any other operators, the method should return 0


			Example:
				int result = calculate(10, '+', 20);

			Output:
				30


	5.2 Overload the calculate method to handle double numbers.

			Example:
				double result = calculate(2.5, '*', 3.0);

			Output:
				7.5


	5.3 Create a method named square that takes an int and returns the square, hierarchically calling the
	calculate method to calculate the square.

			Example:
				int num = square(8);

			Output:
				64

	5.4 Overload the square method for double numbers.

			Example:
				double num = square(1.5);

			Output:
				2.25

	5.5 Create a method named cube that takes an int and returns the cube, hierarchically calling the
	square method to calculate the cube.

			Example:
				int num = cube(3);

			Output:
				9

	5.6 Overload the cube method for double numbers.

			Example:
				double num = cube(2.5);

			Output:
				15.625

 */