import java.util.Scanner;

public class Kool {

public static void main(String[]args) throws InterruptedException {

Scanner input=new Scanner(System.in);

System.out.print("how many seconds to countdown from:");

int start =input.nextInt();

for (int i=start;i>0;i--) {
if (i==5) {
   break;

Thread.sleep(1000);
}
System.out.print("you are hungry go and drink garri");

}

}
}
