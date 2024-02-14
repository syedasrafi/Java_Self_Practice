package practice_tasks.java_day13_OOP_inheritance.phone_tasks;

public class Nokia extends Phone {
    public Nokia(String brand, String model, String size, double price, String color) {
        super(brand, model, size, price, color);
    }
}
/*
3. Create a class named 'Nokia' with these specifications:
   Attributes:
       - Same as IPhone.

   Encapsulation:
       - Same conditions as IPhone.

   Constructor:
       - Same as IPhone.

   Actions:
       - call(phoneNumber): Display "calling the number [phoneNumber]".
       - text(phoneNumber): Display "texting to the number [phoneNumber]".
       - toString(): Prints the information of the Nokia object.

 */