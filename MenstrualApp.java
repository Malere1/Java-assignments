import java.util.Scanner;
public class MenstrualApp {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter your name");
String name = input.nextLine();
System.out.print("Enter cycle length ");
int cycleLength = input.nextInt();
System.out.print("Enter period duration");
int periodDuration = input.nextInt();
System.out.print("Enter days passed since last period started: ");
int startDay = input.nextInt();
int nextPeriod = startDay + cycleLength;
int ovulation = nextPeriod - 14;
System.out.println("Name: " + name);
System.out.println("Next period day: " + nextPeriod);
System.out.println("Ovulation day: " + ovulation);
    }
}
