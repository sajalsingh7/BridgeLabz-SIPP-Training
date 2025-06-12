import java.util.Scanner;
class Dis {
public static void main(String[] args) {
double fee, discountPercent, amt, total;
Scanner sc = new Scanner(System.in);

System.out.print("Enter the student fee: ");
fee = sc.nextDouble();

System.out.print("Enter the discount percent: ");
discountPercent = sc.nextDouble();

amt = (fee * discountPercent) / 100;
total = fee - amt;

System.out.println("The discount amount is INR " + amt +" and final discounted fee is INR " + total);
}
}
