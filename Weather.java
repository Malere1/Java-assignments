import java.util.Scanner;

public class Weather {

public static void main(String[]args) {

Scanner input = new Scanner(System.in);

System.out.println("Enter first integer:");
int number1=input.nextInt();

System.out.println("Enter second integer:");
int number2=input.nextInt();

if (number2 !=0 && number1 % number2 == 0)  {

System.out.println(number1 + " is a musltiple of " + number2);
} else { 

System.out.println(number1 + " is NOT multiple of " + number2);

}
input.close();


} 


}
