public class PerfectSquare {
public static boolean isPerfectSquare(int number) {
int root = (int) Math.sqrt(number);
return root * root == number;
}
public static void main(String[] args) {
System.out.println(isPerfectSquare(25));


}


}
