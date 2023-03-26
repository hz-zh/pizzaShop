import java.util.*;

public class PizzaShop {
   public static void main(String args[]) {
       Scanner scanner = new Scanner(System.in);

       System.out.println("Welcome to the Pizza Shop!");
       System.out.print("What size pizza would you like? (12, 14, 16): ");
       String size = scanner.nextLine();

       ArrayList<String> toppings = new ArrayList<String>();
       System.out.print("Select your toppings ('pepperoni', 'mushrooms', 'sweet-peppers', separated by a space): ");
       String toppingsString = scanner.nextLine();
       String[] toppingsArray = toppingsString.split(" ");
       for (String topping : toppingsArray) {
           toppings.add(topping.trim());
       }

       System.out.print("Is this order for delivery? [y/n]: ");
       String deliveryOption = scanner.nextLine();

       if (deliveryOption.equals("y")) {
           System.out.print("What is the delivery address? ");
           String address = scanner.nextLine();
           DeliveryPizza pizza = new DeliveryPizza(size, toppings, address);
           pizza.printOrder();
       } 
       else if (deliveryOption.equals("n")) {
           Pizza pizza = new Pizza(size, toppings);
           pizza.printOrder();
       } 
       else {
           System.out.println("Invalid option delivery item");
       }

       scanner.close();
   }
}

