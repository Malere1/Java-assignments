import java.util.Scanner;

public class MinutesToYearsDays {

 public static void main(String[] args) {

 Scanner input = new Scanner(System.in);

 System.out.println("Enter number of minutes:");

  long minutes = input.nextLong();

 long days = minutes / 1440;
 long years = days / 365;
 long remainingDays = days % 365;

 System.out.println(minutes);
    }


}


