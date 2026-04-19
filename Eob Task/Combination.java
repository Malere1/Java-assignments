public class  Combination {
public static void main(String[] args) {
int count = 0;

for (int amount = 1; amount <= 7; amount++) {
for (int counter = amount + 1; counter<= 7; counter++) {
System.out.println(amount + " " + counter);
    amount++;
  }
}

System.out.println("Total = " + count);
    }
}
