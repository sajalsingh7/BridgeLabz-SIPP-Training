import java.util.Scanner;
public class QuotientRemainder {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter number: ");
int number=sc.nextInt();
System.out.print("Enter divisor: ");
int divisor=sc.nextInt();

int[] result=findRemainderAndQuotient(number,divisor);
System.out.println("Quotient: "+result[0]);
System.out.println("Remainder: "+result[1]);
}

public static int[] findRemainderAndQuotient(int number,int divisor) {
int[] result = new int[2];
result[0] = number/divisor;
result[1] = number%divisor;
return result;
}
}
