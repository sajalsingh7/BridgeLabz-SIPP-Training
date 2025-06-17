import java.util.Scanner;
public class MinMax {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter first number: ");
int n1=sc.nextInt();
System.out.print("Enter second number: ");
int n2=sc.nextInt();
System.out.print("Enter third number: ");
int n3=sc.nextInt();

int[] result=findSmallestAndLargest(n1,n2,n3);
System.out.println("Smallest number is: "+result[0]);
System.out.println("Largest number is: "+result[1]);
}

public static int[] findSmallestAndLargest(int a,int b,int c) {
int smallest=a;
if(b<smallest){
smallest=b;
}

if(c<smallest){
smallest=c;
}

int largest=a;
if(b>largest){
largest=b;
}

if(c>largest){
largest=c;
}

return new int[]{smallest,largest};
}
}
