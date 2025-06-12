class Volume {
public static void main(String[] args) {
double r = 6378;
double pi = Math.PI;

double vkm = (4.0 / 3.0) * pi * Math.pow(r, 3);
double convert = Math.pow(0.621371, 3);
double vmiles = vkm * convert;

System.out.println("The volume of earth in cubic kilometers is " + vkm + " and cubic miles is " + vmiles);
}
}
