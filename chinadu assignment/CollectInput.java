import java.util.Scanner;
public class CollectInput {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter a number:");
int number = input.nextInt();
int sum=0;
for(int count=2;count<=number;) {
if(number % count ==0) {
number=number/count;
sum += count;
}
else {
count++;
}
}
System.out.print(sum);
}
}
