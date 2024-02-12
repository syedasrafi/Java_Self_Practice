package practice_tasks.java_day11_Class_Objects;

public class PizzaClients {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza("small", 2,2);
        Pizza pizza2 = new Pizza("Medium", 1,3);

        System.out.println(pizza1 + "\n" + pizza2);


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