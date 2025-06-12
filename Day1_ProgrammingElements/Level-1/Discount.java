class Discount {
public static void main(String[] args) {
double fee = 125000;
double dpercent = 10;

double discount = (fee * dpercent) / 100;
double total = fee - discount;

System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + total);
}
}
