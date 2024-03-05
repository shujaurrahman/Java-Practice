import java.util.Scanner;

public class LargestFibBetweenTwoIntegers {
    public static void main(String[] args) {
        // Get input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        // Find and display the largest Fibonacci number between the two integers
        int result = findLargestFibonacci(num1, num2);
        System.out.println("The largest Fibonacci number between " + num1 + " and " + num2 + " is: " + result);

        // Close the scanner
        scanner.close();
    }

    // Function to find the largest Fibonacci number between two integers
    private static int findLargestFibonacci(int num1, int num2) {
        int fib1 = 0;
        int fib2 = 1;

        // Find the largest Fibonacci number less than or equal to num2
        while (fib2 <= num2) {
            int temp = fib1 + fib2;
            fib1 = fib2;
            fib2 = temp;
        }

        // Backtrack to the largest Fibonacci number less than or equal to num2
        int result = 0;
        while (fib1 >= num1) {
            if (fib1 >= num1 && fib1 <= num2) {
                result = fib1;
            }
            int temp = fib1 - fib2;
            fib1 = fib2;
            fib2 = temp;
        }

        return result;
    }
}
