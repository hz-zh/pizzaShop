import java.util.*;

class Pizza {
    public String size;
    public ArrayList<String> toppings;
    public double price;

    public Pizza(String size, ArrayList<String> toppings) {
        this.size = size;
        this.toppings = toppings;

        if (size.equals("12")) {
            price = 10.99;
        } else if (size.equals("14")) {
            price = 14.99;
        } else if (size.equals("16")) {
            price = 18.99;
        } else {
            System.out.println("Invalid size");
        }

        for (String topping : toppings) {
            if (topping.equals("pepperoni")) {
                price += 1.99;
            } else if (topping.equals("mushrooms")) {
                price += 0.99;
            } else if (topping.equals("sweet-peppers")) {
                price += 0.49;
            } else {
                System.out.println("Invalid topping: " + topping + ". You will not be charged for this item.");
            }
        }
    }

    public void printOrder() {
        String toppingsFormat = toppings.toString()
            .replace("[", "")  
            .replace("]", "")  
            .trim();   
        System.out.println("Your order:");
        System.out.println("Size: " + size + " inch");
        System.out.println("Toppings: " + toppingsFormat);
        System.out.println("Price: $" + String.format("%.2f", price));
    }
}

class DeliveryPizza extends Pizza {
    private String address;

    public DeliveryPizza(String size, ArrayList<String> toppings, String address) {
        super(size, toppings);
        this.address = address;
        price += 5.00;
    }

    public void printOrder() {
        super.printOrder();
        System.out.println("Delivery address: " + address);
    }
}

