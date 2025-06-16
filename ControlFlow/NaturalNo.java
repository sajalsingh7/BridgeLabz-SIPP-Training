import java.util.Scanner;
class NaturalNo {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
int n = sc.nextInt();

if(n > 0) {
int sum = 0;
for(int i = 1; i <= n; i++) {
sum = sum + i;
}

int formula = n * (n + 1) / 2;

System.out.println("Sum using for loop: " + sum);
System.out.println("Sum using formula: " + formula);

if(sum == formula) {
System.out.println("Results are same.");
} else {
System.out.println("Results are not same.");
}
} else {
System.out.println("Enter a number greater than 0.");
}
}
}
