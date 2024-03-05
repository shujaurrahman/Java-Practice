// import java.util.Scanner;

// public class LargestPrimeBetweenTwoIntegers {
//     public static void main(String[] args) {
//         // Get input from the user
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter the first integer: ");
//         int num1 = scanner.nextInt();

//         System.out.print("Enter the second integer: ");
//         int num2 = scanner.nextInt();

//         // Find the largest prime number between the two integers
//         int largestPrime = findLargestPrime(num1, num2);

//         // Display the result
//         if (largestPrime == -1) {
//             System.out.println("There is no prime number between the given range.");
//         } else {
//             System.out.println("The largest prime number between " + num1 + " and " + num2 + " is: " + largestPrime);
//         }

//         // Close the scanner
//         scanner.close();
//     }

//     // Function to check if a number is prime
//     private static boolean isPrime(int num) {
//         if (num <= 1) {
//             return false;
//         }
//         for (int i = 2; i <= Math.sqrt(num); i++) {
//             if (num % i == 0) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     // Function to find the largest prime number between two integers
//     private static int findLargestPrime(int num1, int num2) {
//         int largestPrime = -1;
//         for (int i = num2; i >= num1; i--) {
//             if (isPrime(i)) {
//                 largestPrime = i;
//                 break;
//             }
//         }
//         return largestPrime;
//     }
// }

import java.util.Scanner;

public class LargestPrimeBetweenTwoIntegers {
    public static void main(String[] args) {
        System.out.println("Enter two numbers : ");
        int num1,num2;
        Scanner sc=new Scanner(System.in);
        num1=sc.nextInt();
        num2=sc.nextInt();
        int lp=Largestprime(num1, num2);
        if(lp==-1){
            System.out.println("No Prime Number exit ");
        }
        else{
            System.out.println("Largest Prime Number between the two number is : "+lp);
        }
    }

    public static boolean isPrime(int n){
        if(n<1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
            break;
        }
        return true;
    }

    public static int Largestprime(int first,int second){
        int largestPrime=-1;
        for(int i=second;i>=first;i--){
            if(isPrime(i)){
                largestPrime=i;
                break;
            }
        }
        return largestPrime;

    }
}