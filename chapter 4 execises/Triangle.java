import java.util.Scanner;
public class Triangle {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int base;
do {
System.out.print("Enter base length (1-10): ");
base = input.nextInt();
} while (base < 1 || base > 10);
for (int row = 1; row <= base; row++) {
for (int col = 1; col <= row; col++)
System.out.print("*");
System.out.println();
}
}
}
