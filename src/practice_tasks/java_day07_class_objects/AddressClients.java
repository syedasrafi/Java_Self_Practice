package practice_tasks.java_day07_class_objects;

public class AddressClients {
    public static void main(String[] args) {

        Address address1 = new Address();
        address1.buildingNumber = 123;
        address1.street = "New York Ave";
        address1.city = "Buffalo";
        address1.state = "NY";
        address1.zipcode = "14212";

        System.out.println(address1.toString());
        System.out.println();

        Address address2 = new Address();
        address2.buildingNumber = 456;
        address2.street = "James K Way";
        address2.city = "Newark";
        address2.state = "NJ";
        address2.zipcode = "10472";

        System.out.println(address2.toString());

    }
}
