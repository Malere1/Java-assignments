public class Pentagonal {
public static int getPentagonalNumber(int number) {
return number* (3 * number - 1) / 2;
}
public static void main(String[] args) {
for (int count = 1; count <= 100; count++) {
System.out.printf("%7d", getPentagonalNumber(count));
 if (count % 10 == 0)
System.out.println();
  } }
}
