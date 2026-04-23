public class TwoLargest {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int largest = Integer.MIN_VALUE;
int secondLargest = Integer.MIN_VALUE;
for (int counter = 1; counter <= 10; counter++) {
System.out.printf("Enter integer %d of 10: ", counter);
int number = input.nextInt();
if (number > largest) {
secondLargest = largest;
largest = number;
} else if (number > secondLargest) {
secondLargest = number;
}
}
}
}
