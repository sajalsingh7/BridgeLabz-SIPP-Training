import java.util.Scanner;
class CountdownNo {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter number to start countdown: ");
int counter=sc.nextInt();

for(int i=counter;i>=1;i--) {
System.out.println(i);
}

System.out.println("Rocket Launched");
}
}
