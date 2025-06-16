import java.util.Scanner;
class Table {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
int num = sc.nextInt();

for(int i = 6; i <= 9; i++) {
int table = num*i;
System.out.println(num + " * " + i + " = " + table);
}
}
}
