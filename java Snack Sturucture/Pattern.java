public class Pattern  {
public static void displayPattern(int n) {
for (int count = 1; count <= 8; count++) {
for (int counter = count; counter >= 1; counter--) {
System.out.print(counter + " ");
}
System.out.println();
}
}
public static void main(String[] args) {
displayPattern(5);
    }
}
