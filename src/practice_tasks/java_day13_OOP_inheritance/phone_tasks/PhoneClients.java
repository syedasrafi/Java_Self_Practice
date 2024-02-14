package practice_tasks.java_day13_OOP_inheritance.phone_tasks;

public class PhoneClients {
    public static void main(String[] args) {

        IPhone iPhone = new IPhone("Apple", "iphone15 pro", "7.1 in", 1200, "White");
        Samsung samsung = new Samsung("Samsung", "Galaxy", "5.2 in", 950, "Gray");
        Nokia nokia = new Nokia("Nokia", "Flip3", "5.7 in",1100, "Red");

        System.out.println("Iphone: " + iPhone);
        iPhone.faceTime("9891235432");
        iPhone.call("1234567898");

        System.out.println("Samsung: " + samsung);
        samsung.text("56734582634");

        System.out.println("Nokia: " + nokia);
        nokia.call("46573643746");




    }
}
/*
4. Create a class named "PhoneClients":
   - Create multiple objects representing different phones.
   - Test the methods and variables of each object.

 */
