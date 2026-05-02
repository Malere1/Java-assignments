import java.util.Scanner;

public class CollectNumber {

public static void main(String[] args)  {

Scanner input = new Scanner(System.in);

System.out.println("Enter first number1");

int firstnumber1= input.nextInt();

int largest = firstnumber1;

System.out.println("Enter second Number2");
int secondNumber2 = input.nextInt();

if (secondNumber2 > largest) {

largest = secondNumber2;
}
System.out.println("Enter  number3");
int number3= input.nextInt();


if (number3 > largest) {
   largest = number3;
}

System.out.printf("largest is: %d",largest);
   }
   }

  

  






