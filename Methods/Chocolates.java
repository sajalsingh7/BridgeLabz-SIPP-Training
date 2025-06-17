import java.util.Scanner;
public class Chocolates {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter number of chocolates: ");
int chocolates=sc.nextInt();
System.out.print("Enter number of children: ");
int children=sc.nextInt();

int[] result = findRemainderAndQuotient(chocolates,children);
System.out.println("Each child gets "+result[0]+" chocolates and remaining chocolates are "+result[1]);
}

public static int[] findRemainderAndQuotient(int number,int divisor) {
int quotient = number/divisor;
int remainder = number%divisor;
return new int[]{quotient,remainder};
}
}
