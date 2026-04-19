public class Factorial {

public static long factorialOf(int number) {
long result = 1;

for (int count = 1; count <= number; count++) {
result *= count;
}
return result;
}
public static void main(String[] args) {
long answer = factorialOf(5);
System.out.println(answer); 
    }
}
