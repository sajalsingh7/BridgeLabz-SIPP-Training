import java.util.Scanner;
class HarshadNumber {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
int num = sc.nextInt();

int n = num;
int sum = 0;
while(num != 0) {
sum = sum + num % 10;
num = num / 10;
}

if(n % sum == 0) {
System.out.println("Harshad Number" + n);
} else {
System.out.println("Not a Harshad Number" + n);
}
}
}


