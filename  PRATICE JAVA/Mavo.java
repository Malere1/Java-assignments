import java.util.Scanner;

public  class Mavo {
public static void main(String[]args) {
Scanner input=new Scanner(System.in);
System.out.println("enter a number");
int number=input.nextInt();
int grade=80;
if (grade>= 80) {
System.out.println("A");
}
else {
if (grade>=70) {
System.out.println("B");
}
else {
if (grade>=60) {
System.out.println("c");
}
else {
if (grade>=50)  {
System.out.println("pass");
}
 else {
if (grade>=40) {
System.out.println("fail");
}
}
} 
}
}

