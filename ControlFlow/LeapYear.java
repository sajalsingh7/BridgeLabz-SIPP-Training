import java.util.Scanner;
class LeapYear {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a year: ");
int year = sc.nextInt();

if(year >= 1582) {
if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
System.out.println("Leap Year" + year);
} else {
System.out.println(" Not a Leap Year" + year);
}
} else {
System.out.println("Enter a year from 1582");
}
}
}
