import java.util.Scanner;
public class PosNegZero {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number: ");
int num=sc.nextInt();
int result=check(num);

if(result==1){
System.out.println("The number is positive");
}

else if(result==-1){
System.out.println("The number is negative");
}

else{
System.out.println("The number is zero");
}
}

public static int check(int num) {
if(num>0){
return 1;
}

else if(num<0){
return -1;
}

else{
return 0;
}

}
}
