import java.util.Scanner;
class PowerNo {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number: ");
int num = sc.nextInt();
System.out.print("Enter the power: ");
int power = sc.nextInt();

int result = 1;
int counter = 0;
while(counter < power) {
result = result * num;
counter++;
}
System.out.println("Power of a number is " + result);
}
}
