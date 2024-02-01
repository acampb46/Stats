public class StandardDeviation implements Runnable {
    public static double stdDev;
    private final int[] numbers;

    public StandardDeviation(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        int length = numbers.length;

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        double mean = (double) sum / length;

        for (double number : numbers) {
            stdDev += Math.pow(number - mean, 2);
        }

        stdDev = Math.sqrt(stdDev / length);
    }

    public static double getStdDev() {
        return stdDev;
    }
}
