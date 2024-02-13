package practice_tasks.java_day12_OOP_Encapsulation;

public class Item {
    private String name;
    private double unitPrice;
    private int quantity;

    public Item(String name, double unitPrice, int quantity){
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()){
            System.out.println("Name cannot be empty or blank");
            System.exit(1);
        }
        if (!name.matches("^[a-zA-Z\\s]+$")){
            System.out.println("Name must contain letters and space only");
            System.exit(1);
        }
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if(unitPrice < 0){
            System.out.println("unitPrice cannot be negative");
            System.exit(1);
        }
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity < 0){
            System.out.println("Quantity cannot be negative");
            System.exit(1);
        }
        this.quantity = quantity;
    }

    public double calCost(){
        return unitPrice*quantity;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ",totalCost=" + calCost()+
                '}';
    }
}
/*
3. Create a custom class named Item with the following specifications:

	Attributes:
		name
		unitPrice
		quantity

	Ensure encapsulation for all fields.
		Conditions:
			The name cannot be empty or blank.
			The name cannot contain any special characters other than space.
			The name must start with letters.
			The unitPrice cannot be negative.
			The quantity cannot be negative.

	Add a constructor that enables the user to set all fields during object creation.

	Actions:
		calcCost(): Returns the total cost.
		toString(): Displays the name, unit price, quantity, and total cost calculated by calcCost() when the object is printed.

	Create another class named ItemClients, create multiple item objects, and test each function of the item object.

 */