import java.util.Scanner;

public class Principalinterest {

public static void main(String[]args)  {

Scanner input = new Scanner(System.in);

System.out.println("enter principal");
double principal = input.nextDouble();

System.out.println("Enter interestrate");
 double interestrate = input.nextDouble();

System.out.println("Enter time");
 double time = input.nextDouble();

double simpleinterest= principal * interestrate * time/100;

double compoundinterest = Math.pow(1 + interestrate /100,time);
  
System.out.println(simpleinterest);

System.out.println(compoundinterest);


}

}                                 
