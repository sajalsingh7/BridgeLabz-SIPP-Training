import java.util.Scanner;
class Feet {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter distance in feet: ");
int feet = sc.nextInt();

int yards = feet / 3;
int miles = yards / 1760;
System.out.println("Distance in yards = " + yards);
System.out.println("Distance in miles = " + miles);
}
}
