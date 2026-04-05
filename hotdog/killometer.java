import java.util.Scanner;

public class killometer {

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

System.out.print("Enter first miles:  ");

double miles = scanner.nextDouble();
 
System.out.print("Enter second kilometer");

double kilometer = scanner.nextDouble(); 

double result =miles * kilometer;

System.out.print(result);
}

}
