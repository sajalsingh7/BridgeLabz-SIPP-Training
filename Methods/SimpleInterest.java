import java.util.Scanner;
public class SimpleInterest {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter Principal amount: ");
double principal=sc.nextDouble();
System.out.print("Enter Rate: ");
double rate=sc.nextDouble();
System.out.print("Enter Time: ");
double time=sc.nextDouble();

double si=calculateSI(principal,rate,time);
System.out.println("The Simple Interest is " + si);
}

public static double calculateSI(double p,double r,double t) {
return (p*r*t)/100;
}
}
