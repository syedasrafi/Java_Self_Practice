package practice_tasks.java_day09_arrays;

public class EvenOddNumbers {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7};
        int evenCount = 0,
                oddCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0){
                evenCount ++;
            }else{
                oddCount ++;
            }
        }
        System.out.println("The array has " + evenCount + " even numbers and " + oddCount + " odd numbers.");
    }
}
/*
3. Create a class named EvenOddNumbers and write a program that counts the even and odd numbers from an array of integers.

			Example:
				array = {1, 2, 3, 4, 5, 6, 7};

			Output:
				The array has 4 odd numbers and 3 even numbers.


 */