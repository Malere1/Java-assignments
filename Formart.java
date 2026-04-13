import java.util.Scanner;

public class Formart {

public static void main(String[]args) {

Scanner input= new Scanner(System.in);

System.out.println("Enter hour1");
int hour1=input.nextInt();

System.out.println("Enter minute1");
int minute =input.nextInt();

System.out.println("Enter Hour2");
int hour2=input.nextInt();

System.out.println("Enter minute2");
int minute2 =input.nextInt();

int totalHours=hour1 + hour2;
int totalMinutes=minute + minute2;

int totalhours= totalHours + (totalMinutes / 60);
totalMinutes =totalMinutes % 60;

System.out.println(totalHours + " : " + totalMinutes);


}





}
