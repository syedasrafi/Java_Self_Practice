package practice_tasks.java_day07_class_objects;

public class ItemsClient {

    public static void main(String[] args) {

        Items item1 = new Items();
        item1.itemName = "Apple";
        item1.unitPrice = 2.0;
        item1.quantity = 5;

        Items item2 = new Items();
        item2.itemName = "Orange";
        item2.unitPrice = 1.5;
        item2.quantity = 6;


        //item1.calcCost();
        //item1.toString();
        //System.out.println(item1.toString());
        //System.out.println(item2.toString());
        System.out.println(item1.toString() + "\n" + item2.toString());

    }
}
/*

3. Create a custom class named Item with the following attributes and actions:

      Attributes:
            itemName (String): used for storing the name of the item.
            unitPrice (double): used for storing the unit price of the item.
            quantity (int): used for storing the quantity of the item.

      Actions:
            calcCost(): calculates the total cost of the item.
            toString(): returns a string representation of the Item object with the full information of the item,
            including the total cost calculated by calcCost.


      Create another class named ItemClients, create multiple item objects, and test each function of the item object.


 */