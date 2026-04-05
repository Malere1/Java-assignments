import java.util.Scanner;

public class Temprature {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.println("Enter water kiligram:");
double m =input.nextInt();

System.out.println("Enter intial Temprature: ");
double intialTemprature = input.nextInt();

System.out.println("Enter final temprature:");
double finalTemprature = input.nextInt();

double Q =m *(finalTemprature - intialTemprature) * 4184;

System.out.println(Q);

}

}
