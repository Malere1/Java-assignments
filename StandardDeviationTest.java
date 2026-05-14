public class StandardDeviationTest {
    @Test
    public void testCalculateMean() {
        double[] numbers = {1, 2, 3, 4, 5};
        assertEquals(3.0, StandardDeviation.calculateMean(numbers));
    }

    @Test
    public void testCalculateStandardDeviation() {
        double[] numbers = {1, 2, 3, 4, 5};
        double mean = StandardDeviation.calculateMean(numbers);
        assertEquals(Math.sqrt(2), 
StandardDeviation.calculateStandardDeviation(numbers, mean), 0.01);
    }

    @Test
    public void testCalculateStandardDeviationEmptyArray() {
        double[] numbers = {};
        assertEquals(0.0, 
StandardDeviation.calculateStandardDeviation(numbers, 0), 0.01);
    }

    @Test
    public void testCalculateMeanEmptyArray() {
        double[] numbers = {};
        assertEquals(0.0, StandardDeviation.calculateMean(numbers));
    }
}

