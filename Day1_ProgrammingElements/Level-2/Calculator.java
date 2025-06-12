import java.util.Scanner;
public class Calculator {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter first number: ");
float n1 = sc.nextFloat();
System.out.print("Enter second number: ");
float n2 = sc.nextFloat();

float add = n1 + n2;
float sub = n1 - n2;
float mul = n1 * n2;
float div = n1 / n2;

System.out.println("The add, sub, mul, and div value of 2 numbers " + n1 + " and " + n2 + " is:");
System.out.println("Addition: " + add);
System.out.println("Subtraction: " + sub);
System.out.println("Multiplication: " + mul);
System.out.println("Division: " + div);

sc.close();
}
}
