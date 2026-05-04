public class DaysInYear {
public static int numberOfDaysInAYear(int year) {
if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
return 366;return 365;
 }
public static void main(String[] args) {
for (int i = 2014; i <= 2034; i++) {
System.out.println(i + ": " + numberOfDaysInAYear(i));
}
}
}
