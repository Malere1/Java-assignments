import java.util.Scanner;
public class CreditLimit {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter account number (-1 to quit): ");
int account = input.nextInt();
while (account != -1) {
System.out.print("Beginning balance: ");
int balance = input.nextInt();
System.out.print("Total charges this month: ");
int charges = input.nextInt();
System.out.print("Total credits this month: ");
}
}
}
