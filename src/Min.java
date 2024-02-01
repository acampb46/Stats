/*
 * Ashlee Gerard
 * COSC 525
 * Project 1: Threads
 * 11 February 2024
 *
 * This project utilizes threads to accept user input and calculate average, max, median, min, and standard deviation.
 *
 */
public class Min implements Runnable {
    public static int min;
    private final int[] numbers;

    public Min(int[] numbers) {
        this.numbers = numbers;
    }
    @Override
    public void run() {
        min = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
    }

    public static int getMin() {
        return min;
    }
}
