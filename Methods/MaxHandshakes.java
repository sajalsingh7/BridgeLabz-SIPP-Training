import java.util.Scanner;
public class MaxHandshakes {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter number of students: ");
int num=sc.nextInt();

int handshakes=calHandshakes(num);
System.out.println("Maximum number of handshakes possible: "+handshakes);
}

public static int calHandshakes(int n) {
return (n*(n-1))/2;
}
}
