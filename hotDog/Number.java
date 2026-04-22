import java.util.Scanner;

public class Number {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter meter : ");

int meter = input.nextInt();

int feet=meter * 32786;

System.out.println(feet);

}

}
