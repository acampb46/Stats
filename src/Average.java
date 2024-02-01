/*
 * Ashlee Gerard
 * COSC 525
 * Project 1: Threads
 * 11 February 2024
 *
 * This project utilizes threads to accept user input and calculate average, max, median, min, and standard deviation.
 *
 */
public class Average implements Runnable {
    public static double avg;
    private final int[] numbers;

    public Average(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        avg = (double) sum / numbers.length;
    }

    public static double getAvg() {
        return avg;
    }
}
