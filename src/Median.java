/*
 * Ashlee Gerard
 * COSC 525
 * Project 1: Threads
 * 11 February 2024
 *
 * This project utilizes threads to accept user input and calculate average, max, median, min, and standard deviation.
 *
 */
import java.util.Arrays;

public class Median implements Runnable {
    public static double median;
    private final int[] numbers;

    public Median(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        Arrays.sort(numbers);
        int length = numbers.length;

        if (length % 2 == 0) {
            median = (double) (numbers[length / 2 - 1] + numbers[length / 2]) / 2;
        } else {
            median = numbers[length / 2];
        }
    }

    public static double getMedian() {
        return median;
    }
}
