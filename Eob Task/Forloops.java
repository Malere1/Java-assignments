public class Forloops {
 public static void main(String[] args) {
  double sum = 0;

 for (int count = 1; count <= 99; count+= 2) {
 sum += (double)count / (count + 2);
 }

 System.out.println("Sum = " + sum);
    }
}
