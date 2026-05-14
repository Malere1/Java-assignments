public class StandardDeviation {
public static void main(String[] args) {
        double[] numbers = {1, 2, 3, 4, 5};
        double mean = calculateMean(numbers);
        double stdDev = calculateStandardDeviation(numbers, mean);
        System.out.println("Standard deviation: " + stdDev);
    }

    public static double calculateMean(double[] numbers) {
        double sum = 0;
        for (double number:numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    public static double calculateStandardDeviation(double[] numbers, double 
mean) {
        double sumOfSquares = 0;
        for (double number : numbers) {
            sumOfSquares += Math.pow(num - mean, 2);
        }
        return Math.sqrt(sumOfSquares / numbers.length);
    }
}

