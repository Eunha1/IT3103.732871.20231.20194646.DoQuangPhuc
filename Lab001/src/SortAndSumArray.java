
import java.util.Scanner;
import java.util.Arrays;

public class SortAndSumArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number of element in array : ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter element of array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the  " + (i + 1)  + "st element: ");
            numbers[i] = scanner.nextInt();
        }
        Arrays.sort(numbers);
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        float average = sum / n;
        System.out.println("Sorted array is: " + Arrays.toString(numbers));
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        scanner.close();
    }
}
