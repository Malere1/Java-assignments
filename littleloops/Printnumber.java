import java.util.Scanner;

public class Printnumber {

public static void main (String[]arg) {

Scanner input=new Scanner(System.in);

System.out.println("Enter a number:");
int n=input.nextInt();

for (int count=1; count<=n; count++) {
 System.out.println(count);


}
}

}


