package practice_tasks.java_day06_methods;

public class MaximumAndMinimum {
    public static void main(String[] args) {

        int maxNum = max(50,0);
        System.out.println(maxNum);

        double maxDouble = max(33.0, 39.0);
        System.out.println(maxDouble);

        int minNum = min(19,15);
        System.out.println(minNum);

        double minDouble = min(12.5,5.6);
        System.out.println(minDouble);
    }


         public static int max(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
        }

        public static double max(double a, double b) {
        if (a > b){
            return a;
        }else{
            return b;
        }
        }

        public static int min(int num1, int num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
        }

        public static double min(double a, double b) {
        if (a < b){
            return a;
        }else{
            return b;
        }
        }

    }

/*
3. Create a class named MaximumAndMinimum:

	2.1 Create a method named max that returns the maximum number between two integer numbers.

	2.2 Create a method named max that returns the maximum number between two double numbers.

	2.3 Create a method named min that returns the minimum number between two integer numbers.

	2.4 Create a method named min that returns the minimum number between two double numbers.


			Example1:
				double n = max(10.5, 30.2);

			Output:
				30.2

			Example2:
				int m = min(100, 200);

			Output:
				100
 */