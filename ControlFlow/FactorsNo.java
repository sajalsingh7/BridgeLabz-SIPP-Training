import java.util.Scanner;
class FactorsNo {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a positive number: ");
int num = sc.nextInt();

if(num > 0) {
System.out.println("Factors of a number are : ");
for(int i = 1; i < num; i++) {
if(num % i == 0) {
System.out.println(i);
}
}
} else {
System.out.println("Please enter a positive number");
}
}
}
