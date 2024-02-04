package practice_tasks.java_day03_operators;

public class Rectangle {
    public static void main(String[] args) {

        double length = 4.5,
                width = 2;
        int area = (int)(length*width);
        double perimeter = (double) (2*(length+width));


        System.out.println("The area of the rectangle is " + area);
        System.out.println("The perimeter of the rectangle is " + perimeter);
    }
}

/*
1. Create a class named Rectangle with the following variables:
					length
					width

	Write a program that calculates the area and perimeter of the given rectangle.

					Example:
						length = 4.5
						width = 2

					Output:
						The area of the rectangle is 9.0
						The perimeter of the rectangle is 13.0

			Hint:
				Area of rectangle:
					area=length×width

				Perimeter of rectangle:
					perimeter=2×(length+width)
 */