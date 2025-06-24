package oops_package;

public class Item {
    int itemCode;
    String itemName;
    double price;

    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public void displayItemDetails() {
        System.out.println("Item Code : " + itemCode);
        System.out.println("Item Name : " + itemName);
        System.out.println("Unit Price: " + price);
    }

    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

