import java.util.Scanner;
class NaturalNoSum {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter a natural number: ");
int n=sc.nextInt();

if(n>0) {
int sum=0;
int i=1;
while(i<=n) {
sum=sum+i;
i=i+1;
}

int formulaSum=n*(n+1)/2;

System.out.println("Sum using while loop: "+sum);
System.out.println("Sum using formula: "+formulaSum);

if(sum==formulaSum) {
System.out.println("Results are same");
} else {
System.out.println("Results are different");
}
} else {
System.out.println("Enter a natural number greater than 0");
}
}
}
