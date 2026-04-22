import java.util.Scanner;

public class Taskfourteen {

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

System.out.print("Enter first integer:  ");

int number1 = scanner.nextInt();

System.out.print("Enter second number:  ");
int number2 = scanner.nextInt();
 
System.out.print("Enter third integer:  ");
int number3 = scanner.nextInt();

int sum=number1 + number2 +number3;
double average=sum / 3;

System.out.print(average);

}
}
