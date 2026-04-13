import java.util.Scanner;
public class Bado {
public static void main(String[]args) {
Scanner input=new Scanner(System.in);

System.out.println("press 1 to enter contant....");
System.out.println("press 2 to enter massage....");
System.out.println("press 3to enter call....");
int choice=input.nextInt();
switch (choice) {
case 1:
System.out.print("opening contact");
break;
case 2:
System.out.print("opening massage");
break;
case 3:
System.out.print("opening call");
break;

default:
System.out.print("Invailed");

}

}




}


