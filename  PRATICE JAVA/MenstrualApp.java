import java.util.Scanner;
  public class MenstrualApp {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter first day of last period: ");
       int lastPeriod = input.nextInt();

        System.out.print("Enter cycle length: ");
        int cycleLength = input.nextInt();

        System.out.print("Enter flow days: ");
        int flowDays = input.nextInt();

        int nextPeriod = lastPeriod + cycleLength;
        int ovulation = nextPeriod - 14;
        int fertileStart = ovulation - 5;
        int fertileEnd = ovulation + 1;

        System.out.println("Next Period: Day " + nextPeriod);
        System.out.println("Ovulation Day: Day " + ovulation);
        System.out.println("Fertile Window: Day " + fertileStart + " to Day " + fertileEnd);
        System.out.println("Safe Period: Other days");
    }
}
