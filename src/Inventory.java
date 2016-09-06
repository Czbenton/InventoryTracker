import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Zach on 9/6/16.
 */
public class Inventory {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<InventoryItem> items = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {
            int i = 1;
            for (InventoryItem listItems : items) {
                System.out.println( i + ". " + "[" + listItems.quantity + "] " + listItems.name);
                i++;
            }
            System.out.println("1. Add new item to your inventory.");
            System.out.println("2. Remove item from your inventory.");
            System.out.println("3. Change quantity of an item.");

            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    InventoryItem.addItem();
                    break;
                case "2": {
                    InventoryItem.removeItem();
                    break;
                }
                case "3": {
                    InventoryItem.changeQuantity();
                    break;
                }
                default: {
                    System.out.println("Please enter a valid option.\n");
                }
            }
        }
    }
}