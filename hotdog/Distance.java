import java.util.Scanner;

public class  Distance {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.println("Enter distance :");
double  distance =input.nextDouble();

System.out.println("Enter malies:");
double miles =input.nextDouble();
;
System.out.println("Enter price:");
double price =input.nextDouble();

double cost=distance * price; 

System.out.println(cost);

}

}
