import java.util.Scanner;
class Voting {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter the person age: ");
int age=sc.nextInt();

if(age>=18){
System.out.println("The person age is " + age + " and can vote.");
}else{
System.out.println("The person age is " + age + " and cannot vote.");
}
}
}
