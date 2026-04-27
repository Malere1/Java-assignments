import java.util.Scanner;
public class PizzaWahala {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter number of guests: ");
int guests = input.nextInt();
System.out.print("Enter pizza size (1 = Small, 2 = Medium, 3 = Large): ");
 int size = input.nextInt();
int pricePerBox = 0;
if (size == 1) pricePerBox = 2000;
else if (size == 2) pricePerBox = 3000;
else if (size == 3) pricePerBox = 4000;
else {
System.out.println("Invalid size!");
return;
 }
int slicesPerPerson = 2;
int slicesPerBox = 8;
int totalSlicesNeeded = guests * slicesPerPerson;
int boxes = totalSlicesNeeded / slicesPerBox;
if (totalSlicesNeeded % slicesPerBox != 0) {
boxes++;
}
int totalSlicesBought = boxes * slicesPerBox;
int leftoverSlices = totalSlicesBought - totalSlicesNeeded;
int totalPrice = boxes * pricePerBox;
System.out.println("\n--- RESULT ---");
System.out.println("Total guests: " + guests);
System.out.println("Total slices needed: " + totalSlicesNeeded);
System.out.println("Boxes to buy: " + boxes);
System.out.println("Leftover slices: " + leftoverSlices);
System.out.println("Total price: ₦" + totalPrice);
    }
}
