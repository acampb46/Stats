public class Max implements Runnable {
    public static int max;
    private final int[] numbers;

    public Max(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        max = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
    }

    public static int getMax() {
        return max;
    }
}
