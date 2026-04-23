import java.util.Scanner;
public class FindLargest {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int counter = 1;
int largest = Integer.MIN_VALUE;
while (counter <= 10) {
System.out.printf("Enter integer %d of 10: ", counter);
int number = input.nextInt();
if (number > largest)
largest = number;
counter++;
}
System.out.println("Largest number: " + largest);
}
}
