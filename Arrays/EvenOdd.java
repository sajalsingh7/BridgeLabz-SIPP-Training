import java.util.Scanner;
public class EvenOdd {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter a natural number: ");
int num=sc.nextInt();

if(num<=0){
System.out.println("Enter a natural number greater than 0");
return;
}

int[] odd=new int[num/2+1];
int[] even=new int[num/2+1];

int oddIndex=0;
int evenIndex=0;

for(int i=1;i<=num;i++){
if(i%2 == 0){
even[evenIndex]=i;
evenIndex++;
}
else{
odd[oddIndex]=i;
oddIndex++;
}
}

System.out.print("Even numbers: ");
for(int i=0;i<evenIndex;i++){
System.out.print(even[i]+" ");
}

System.out.println();
System.out.print("Odd numbers: ");
for(int i=0;i<oddIndex;i++){
System.out.print(odd[i]+" ");
}
System.out.println();
}
}
