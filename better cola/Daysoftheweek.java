import java.util.Scanner;

public class Daysoftheweek {

public static void main(String[]args) {

Scanner input=new Scanner(System.in);

System.out.println("enter number(0-7)");
int number = input.nextInt() ;

if(number==0) {
System.out.println("monday");
}
 

else if(number==1) {
System.out.println("tuesday");
}

else if(number==2) {
System.out.println("wesday");
} 

else if(number==3) {
System.out.println("thusday");
}
 
else if(number==4) {
System.out.println("friday");
}
 
else if(number==5) {
System.out.println("saturday");
}
 
else if(number==6) {
System.out.println("sunday");
         }
 else{
System.out.println(" invalid input");
}

}
  }
