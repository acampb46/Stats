/*
* Ashlee Gerard
* COSC 525
* Project 1: Threads
* 11 February 2024
*
* This project utilizes threads to accept user input and calculate average, max, median, min, and standard deviation.
*
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Prompt user for input
        System.out.println("Please enter some numbers separated by spaces.");
        String input = scanner.nextLine();

        //Split string by white-spaces
        String[] data = input.split("\\s+");

        int[] numbers = new int[data.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(data[i]);
        }

        //Create Threads
        Thread avgThread = new Thread(new Average(numbers));
        Thread minThread = new Thread(new Min(numbers));
        Thread maxThread = new Thread(new Max(numbers));
        Thread medianThread = new Thread(new Median(numbers));
        Thread stdDevThread = new Thread(new StandardDeviation(numbers));

        //Start Threads
        avgThread.start();
        minThread.start();
        maxThread.start();
        medianThread.start();
        stdDevThread.start();

        //Wait for everything to finish
        try {
            avgThread.join();
            minThread.join();
            maxThread.join();
            medianThread.join();
            stdDevThread.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("The average value is: " + Average.getAvg());
        System.out.println("The minimum value is: " + Min.getMin());
        System.out.println("The maximum value is: " + Max.getMax());
        System.out.println("The median value is: " + Median.getMedian());
        System.out.println("The standard deviation is: " + StandardDeviation.getStdDev());
    }
}