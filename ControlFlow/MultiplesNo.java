import java.util.Scanner;
class MultiplesNo {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a positive number less than 100: ");
int num = sc.nextInt();

if (num > 0 && num < 100) {
System.out.println("Multiples of a number :");
for (int i = 100; i >= 1; i--) {
if (i % num == 0) {
System.out.println(i);
}
}
} else {
System.out.println("Enter a number between 1 and 100");
}
}
}
