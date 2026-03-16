import java.util.HashMap;
import java.util.Scanner;

public class Problem2FlashSaleInventory {

    public static void main(String[] args) {

        System.out.println("Flash Sale Inventory Tracker");

        HashMap<String, Integer> inventory = new HashMap<>();

        inventory.put("Laptop", 10);
        inventory.put("Phone", 20);
        inventory.put("Headphones", 15);
        inventory.put("Smartwatch", 8);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product name: ");
        String product = scanner.nextLine();

        if(inventory.containsKey(product)) {

            int stock = inventory.get(product);

            if(stock > 0) {

                inventory.put(product, stock - 1);
                System.out.println("Purchase successful!");

                System.out.println("Remaining stock: " + inventory.get(product));

            }
            else {
                System.out.println("Out of stock!");
            }

        }
        else {

            System.out.println("Product not found.");

        }

        System.out.println("\nCurrent Inventory:");

        for(String key : inventory.keySet()) {

            System.out.println(key + " : " + inventory.get(key));

        }

        scanner.close();
    }
}