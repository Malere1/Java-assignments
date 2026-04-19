import java.util.Scanner;

public class Displayloops {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter number: ");
 int number = input.nextInt();

for (int count = 1; count<= number; count++) {
System.out.println((int)Math.pow(2, count));
        }
    }
}
