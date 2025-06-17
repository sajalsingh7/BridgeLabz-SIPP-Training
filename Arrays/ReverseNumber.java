import java.util.Scanner;
public class ReverseNumber {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
int num = sc.nextInt();

int temp = num;
int count = 0;

while (temp > 0) {
count++;
temp /= 10;
}

int[] digits = new int[count];
int index = 0;
while (num > 0) {
digits[index] = num % 10;
num /= 10;
index++;
}

System.out.print("Reversed number: ");
for (int i = 0; i < digits.length; i++) {
System.out.print(digits[i]);
}
System.out.println();
}
}
