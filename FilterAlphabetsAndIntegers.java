import java.util.ArrayList;
import java.util.Scanner;

public class FilterAlphabetsAndIntegers {
    public static void main(String[] args) {
        // Get input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();

        // Filter alphabets and integers into separate arrays
        ArrayList<Character> charArray = new ArrayList<>();
        ArrayList<Integer> intArray = new ArrayList<>();

        for (char ch : inputSentence.toCharArray()) {
            if (Character.isLetter(ch)) {
                charArray.add(ch);
            } else if (Character.isDigit(ch)) {
                intArray.add(Character.getNumericValue(ch));
            }
        }

        // Convert ArrayLists to arrays
        char[] charResult = new char[charArray.size()];
        for (int i = 0; i < charArray.size(); i++) {
            charResult[i] = charArray.get(i);
        }

        int[] intResult = new int[intArray.size()];
        for (int i = 0; i < intArray.size(); i++) {
            intResult[i] = intArray.get(i);
        }

        // Display the filtered arrays
        System.out.print("Alphabets: ");
        printArray(charResult);

        System.out.print("Integers: ");
        printArray(intResult);
    }

    // Function to print an array
    private static void printArray(char[] array) {
        System.out.print("(");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println(")");
    }

    // Function to print an array
    private static void printArray(int[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("}");
    }
}
