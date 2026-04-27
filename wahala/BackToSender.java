import java.util.Scanner;

public class BackToSender {

public static int calculatePay(int successfulDeliveries) {
int basePay = 5000;
int amountPerParcel;
 double percentage = (successfulDeliveries / 100.0) * 100;
if (percentage < 50) {
amountPerParcel = 160;
} else if (percentage < 60) {
amountPerParcel = 200;
} else if (percentage < 70) {
amountPerParcel = 250;
} else {
amountPerParcel = 500;
}
return (successfulDeliveries * amountPerParcel) + basePay;
}

public static void main(String[] args) {
Scanner input = new Scanner(System.in);

for (int i = 1; i <= 3; i++) {
System.out.print("Enter successful deliveries for Rider " + i + ": ");
int deliveries = input.nextInt();
int pay = calculatePay(deliveries);
System.out.println("Rider " + i + " earns: ₦" + pay);
System.out.println();
}
}

}
