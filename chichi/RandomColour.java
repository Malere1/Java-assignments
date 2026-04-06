import java.util.Scanner;

public class RandomColour {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter number (1-7): ");
 int num = input.nextInt();

if (num == 1) System.out.println("Violet");

else if (num == 2) System.out.println("Indigo");

 else if (num == 3) System.out.println("Blue");

 else if (num == 4) System.out.println("Green");

 else if (num == 5) System.out.println("Yellow");

  else if (num == 6) System.out.println("Orange");

  else if (num == 7) System.out.println("Red");

        else System.out.println("Invalid number");
    }
}
