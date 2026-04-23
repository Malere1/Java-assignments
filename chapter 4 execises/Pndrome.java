import java.util.Scanner;
public class Pndrome {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int number;
do {
System.out.print("Enter a 5-digit integer: ");
number = input.nextInt();
} while (number < 10000 || number > 99999);
int d1 = number / 10000;
int d2 = (number / 1000) % 10;
int d4 = (number / 10) % 10;
int d5 = number % 10;
if (d1 == d5 && d2 == d4)
System.out.println(number + " is a palindrome.");
else
System.out.println(number + " is NOT a palindrome.");
}
}

