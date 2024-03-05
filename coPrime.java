// import java.util.Scanner;

// public class coPrime {
//     public static void main(String[] args) {
//         // Get input from the user
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter an integer to find its co-primes: ");
//         int number = scanner.nextInt();

//         // Find and display co-primes
//         System.out.println("Co-primes of " + number + ":");
//         findAndDisplayCoPrimes(number);
//     }

//     public static void findAndDisplayCoPrimes(int n) {
//         for (int i = 1; i <= n; i++) {
//             if (areCoPrimes(n, i)) {
//                 System.out.print(i + " ");
//             }
//         }

//     }

//     public static boolean areCoPrimes(int a, int b) {
//         // Calculate GCD using Euclidean Algorithm
//         while (b != 0) {
//             int temp = b;
//             b = a % b;
//             a = temp;
//         }

//         // If GCD is 1, numbers are co-primes
//         return a == 1;
//     }
// }

import java.util.Scanner;

public class coPrime {

    public static void main(String[] args) {
        System.out.println("Enter interger to find coprim: ");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        System.out.println("Co-prime Numbers are: ");
        findAndDisplayCoPrimes(number);
    }
    public static void findAndDisplayCoPrimes(int num){
    for(int i=0;i<=num;i++){
        if(isCoPrime(num,i)){
            System.out.print(i+" ");
        }
    }
    }
    public static boolean isCoPrime(int a,int b){
        while (b!=0) {
            int temp=b;
            b=a%b;
            a=temp;
        }

        return a==1;
    }
}