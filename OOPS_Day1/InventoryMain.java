package oops_package;

public class InventoryMain {
    public static void main(String[] args) {
        
        Item item1 = new Item(101, "Bluetooth Speaker", 1250.00);

        System.out.println("Item Details:");
        item1.displayItemDetails();

        int quantity = 3;
        double totalCost = item1.calculateTotalCost(quantity);
        
        System.out.println("Quantity   : " + quantity);
        System.out.println("Total Cost : " + totalCost);
    }
}

