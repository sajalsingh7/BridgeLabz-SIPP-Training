import java.util.Scanner;
public class Trigonometry {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter angle: ");
double angle = sc.nextDouble();

double[] results = calTrigonometry(angle);
System.out.println("Sine: " + results[0]);
System.out.println("Cosine: " + results[1]);
System.out.println("Tangent: " + results[2]);
}

public static double[] calTrigonometry(double angle) {
double radians = Math.toRadians(angle);
double[] trigValues = new double[3];

trigValues[0] = Math.sin(radians);
trigValues[1] = Math.cos(radians);
trigValues[2] = Math.tan(radians);
return trigValues;

}
}
