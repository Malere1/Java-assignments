import java.util.Scanner;

public class Populationpopulation {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.println("Enter number of year:");
double year =input.nextInt();

System.out.println("Enter Futurepopulation:");
double futurepopulation =input.nextInt();

double result=year * futurepopulation;

System.out.println(result);

}

}
