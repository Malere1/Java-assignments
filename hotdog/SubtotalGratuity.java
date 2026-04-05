import java.util.Scanner;

public class SubtotalGratuity {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter subtotal ");
int subtotal = input.nextInt();

System.out.print("Enter gratuity rate ");
int gratuity = input.nextInt();

int total = subtotal + gratuity;

System.out.println(total);
}













}
