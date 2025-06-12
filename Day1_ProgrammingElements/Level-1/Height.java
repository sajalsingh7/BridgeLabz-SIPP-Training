import java.util.Scanner;
class Height {
public static void main(String[] args) {
double height, inches, feet, leftinches;

Scanner sc = new Scanner(System.in);

System.out.print("Enter your height in centimeters: ");
height = sc.nextDouble();

inches = height / 2.54;
feet = (int) (inches / 12); 
leftinches = inches % 12;    

System.out.println("Your Height in cm is " + height + " while in feet is " + (int)feet + " and inches is " + String.format("%.2f", leftinches));
}
}
