import java.util.Scanner;
public class WindChillCalc {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter temperature: ");
double temperature = sc.nextDouble();
System.out.print("Enter wind speed: ");
double windSpeed = sc.nextDouble();

double windChill = calcWindChill(temperature, windSpeed);
System.out.println("The wind chill temperature is: " + windChill);
}

public static double calcWindChill(double temperature, double windSpeed) {
if (temperature <= 50 && windSpeed >= 3) {
return 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temperature * Math.pow(windSpeed, 0.16);
} else {
return temperature;
}
}
}
