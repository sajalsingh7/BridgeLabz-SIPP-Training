import java.util.Scanner;
public class Quantitiy {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Unit price: ");
int unitPrice = sc.nextInt();
System.out.print("Quantity: ");
int quantity = sc.nextInt();

int price = unitPrice * quantity;
System.out.println(" Total purchase price " + price + " if the quantity " + quantity + " and unit price is " + unitPrice);
sc.close();
}
}
