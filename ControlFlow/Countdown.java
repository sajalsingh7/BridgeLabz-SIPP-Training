import java.util.Scanner;
class Countdown {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter number to start countdown: ");
int counter = sc.nextInt();
while (counter >= 1) {
System.out.println(counter);
counter = counter - 1;
}
System.out.println("Rocket Launched");
}
}
