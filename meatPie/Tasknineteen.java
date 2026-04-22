import java.util.Scanner;

public class Tasknineteen {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int remainder = number % 2;

        System.out.println("Remainder when divided by 2: " + remainder);

        
    }
}
