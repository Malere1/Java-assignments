import java.util.Scanner;

public class SumOfNumber {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.println("Enter a positive number:");

 int number = input.nextInt();

 int sum = number * (number + 1) / 2;

 System.out.println(sum );
    }
}
