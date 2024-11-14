import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userChoice;
        int[] dataPoints = new int[100];
        int sum;
        int avg;
        int min;
        int max;
        int count = 0;
        boolean find = false;
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = (int) (Math.random() * 100) + 1;
            System.out.print(dataPoints[i] + " | ");
        }
        System.out.println();

        max = max(dataPoints);
        min = min(dataPoints);
        sum = sum(dataPoints);

        avg = sum / dataPoints.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        userChoice = InputHelper.getRangedInt(scan, "What number would you like to search for?", 100, 0);
        count = occuranceScan(dataPoints,userChoice);
        System.out.println("Your number " + userChoice + " appeared " + count + " times.");

        userChoice = InputHelper.getRangedInt(scan, "What number's index position would you like to search for?", 100, 0);
        for (int i = 0; i < dataPoints.length; i++) {
            if (userChoice == dataPoints[i]) {
                System.out.println("The value " + userChoice + " was found in array index position " + i + ".");
                find = true;
                break;
            }
        }
        if (!find) {
            System.out.println("The value " + userChoice + " was not found within the array.");
        }


    }

    public static int min(int[] values) {
        int min = values[0];
        for (int x : values) {
            if (x < min) {
                min = x;
            }
        }
        return min;
    }

    public static int max(int[] values) {
        int max = values[0];
        for (int x : values) {
            if (x > max) {
                max = x;
            }
        }
        return max;
    }

    public static int occuranceScan(int values[], int target) {
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            if (target == values[i]) {
                count++;
            }
        }
        return count;
    }
    public static int sum(int values[]) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }
}