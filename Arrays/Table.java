import java.util.Scanner;
class Table {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
int num = sc.nextInt();

int[] table = new int[10];
for (int i = 1; i <= 10; i++) {
table[i - 1] = num * i;
}
for (int i = 0; i < 10; i++) {
System.out.println(num + " * " + (i + 1) + " = " + table[i]);
}
}
}
