package practice_tasks.java_day11_Class_Objects;

public class Pizza {

    public String size;
    public int numberOfCheeseTopping,
            numberOfPepperoniTopping;
    public Pizza (String size, int numberOfCheeseTopping, int numberOfPepperoniTopping){
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;

    }
    public double calCost(){
        double sizePrice = (size.equalsIgnoreCase("small"))?10
                :(size.equalsIgnoreCase("medium")?12:14);
        double totalPrice = sizePrice + (2*(numberOfCheeseTopping+numberOfPepperoniTopping));
        return totalPrice;
    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", totalPrice=" + calCost() +
                '}';
    }
}
/*
1. Create a custom class named Pizza with the following specifications:

    Attributes:
		   size
		   numberOfCheeseTopping
		   numberOfPepperoniTopping

	Actions:
		calcCost(): returns the totalCost of the pizza
		toString(): returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

   Pizza cost is determined by:
   		Small: $10 + $2 per topping
   		Medium: $12 + $2 per topping
   		Large: $14 + $2 per topping

    Create another class named PizzaClients, create multiple pizza objects, and test each function of the pizza object.



 */