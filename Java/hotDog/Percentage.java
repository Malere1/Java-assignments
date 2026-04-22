import java.util.Scanner;

public class Percentage {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.println("Enter balance:");
double balance =input.nextDouble();

System.out.println("Enter annul interest rate:");
double annulinterestrate =input.nextDouble();

double monthlyinterest=balance + annulinterestrate/1200;

System.out.println(monthlyinterest);

}

}
