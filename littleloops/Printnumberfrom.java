import java.util.Scanner;

public class Printnumberfrom {

public static void main (String[]arg) {

Scanner input=new Scanner(System.in);

System.out.println("Enter a number:");
int n=input.nextInt();

for (int count=n; count>=1; count--) {
 System.out.println(count);


}
}

}
