import java.util.Scanner;

public class Production {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter length : ");

int length = input.nextInt();
 
System.out.print("Enter area:  ");

int area =input.nextInt();

int volume =  (area * length);

System.out.println(volume);

}

}
