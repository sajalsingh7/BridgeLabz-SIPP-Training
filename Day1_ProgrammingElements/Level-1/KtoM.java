import java.util.Scanner;
class KtoM {
public static void main(String[] args) {
double km;
double miles;

Scanner sc = new Scanner(System.in);

System.out.print("Enter distance in kilometers: ");
km = sc.nextInt();  
miles = km / 1.6;

System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
}
}
