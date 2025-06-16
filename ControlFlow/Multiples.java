import java.util.Scanner;
class Multiples {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number less than 100: ");
int num = sc.nextInt();

if(num > 0 && num < 100) {
int counter = num;
while(counter < 100) {
System.out.println(counter);
counter = counter + num;
}
} else {
System.out.println("Enter a number greater than 0 and less than 100");
}
}
}
