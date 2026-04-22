import java.util.Scanner;

public class SquareMeterToPing {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter square meter: ");

int meter = input.nextInt();

double ping  = meter * 0.3025;

System.out.println(ping);
}













}
