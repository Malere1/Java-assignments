import java.util.Scanner;

public class Atmprompt {

public static void main(String[]args) {

Scanner input = new Scanner(System.in);

int correctpin=1111;

System.out.println("verify your pin");

int pin=input.nextInt();

if(pin==correctpin) {

System.out.println("your balance your 1000"); 

} else {

System.out.println("incorrect pin");
}


}
}





