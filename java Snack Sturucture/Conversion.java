public class Conversion {
public static double mileToKilometer(double mile) {
return mile * 1.609;
}
public static double kilometerToMile(double km) {
return km / 1.609;
}
public static void main(String[] args) {
for (int i = 1; i <= 10; i++) {
System.out.println(i + " miles = " + mileToKilometer(i) + " km");
System.out.println(i + " km = " + kilometerToMile(i) + " miles");
}
}
}
