import java.util.Scanner;
public class TriangleRounds {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter side 1: ");
double a=sc.nextDouble();
System.out.print("Enter side 2: ");
double b=sc.nextDouble();
System.out.print("Enter side 3: ");
double c=sc.nextDouble();

double rounds=calRounds(a,b,c);
System.out.println("The athlete must complete " + (int)Math.ceil(rounds));
} 

public static double calRounds(double a,double b,double c) {
double perimeter=a+b+c;
double distance=5000.0;
return distance/perimeter;
}
}
