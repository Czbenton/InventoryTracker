/**
 * Created by Zach on 10/19/16.
 */
public class InventoryControl {

    public static void changeQuantity() {
        System.out.println("Please enter the item number you want to change the quantity of.");
        int itemNum = Integer.valueOf(Inventory.scanner.nextLine());

        InventoryItem item = Inventory.items.get(itemNum - 1);

        System.out.println("Please enter the new quantity.");
        int newQuantity = Integer.valueOf(Inventory.scanner.nextLine());

        item.quantity = newQuantity;
    }

    public static void removeItem() {
        System.out.println("Please enter the item number you wish to remove");
        int itemNum = Integer.valueOf(Inventory.scanner.nextLine());

        Inventory.items.remove(itemNum -1);
    }

    public static void addItem() {
        System.out.println("What would you like to add?");
        String userInput = Inventory.scanner.nextLine();

        InventoryItem newItem = new InventoryItem(userInput, 1);
        Inventory.items.add(newItem);
    }
}
