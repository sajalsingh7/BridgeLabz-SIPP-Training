import java.util.Scanner;
class ArmstrongNumber {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
int num = sc.nextInt();

int n = num;
int sum = 0;
while(num != 0) {
int digit = num % 10;
sum = sum + (digit * digit * digit);
num = num / 10;
}

if(sum == n) {
System.out.println("Armstrong Number " + n);
} else {
System.out.println("Not an Armstrong Number " + n);
}
}
}
