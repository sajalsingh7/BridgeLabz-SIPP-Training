import java.util.Scanner;
class FactorialNo {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
int num = sc.nextInt();

if (num >= 0) {
int fact = 1;
for (int i = 1; i <= num; i++) {
fact = fact * i;
}

System.out.println("Factorial of number is" + fact);
} else {
System.out.println("Enter a positive number");
}
}
}
