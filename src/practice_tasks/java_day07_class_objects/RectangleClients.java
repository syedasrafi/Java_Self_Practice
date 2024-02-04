package practice_tasks.java_day07_class_objects;

public class RectangleClients {
    public static void main(String[] args) {


        Rectangle rectangle1 = new Rectangle();
        rectangle1.width = 4;
        rectangle1.length = 6;

        System.out.println(rectangle1);
        rectangle1.calculateArea();
        rectangle1.calculatePerimeter();


    }
}
