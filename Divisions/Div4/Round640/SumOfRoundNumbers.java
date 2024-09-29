package Divisions.Div4.Round640;
//code by senurah
//public class SumOfRoundNumbers {
//    public static void main(String[] args) {
//        java.util.Scanner scanner = new java.util.Scanner(System.in);
//        int t = scanner.nextInt();
//        for (int i = 0; i < t; i++) {
//            int n = scanner.nextInt();
//            int count = 0;
//            int[] arr = new int[5];
//            int j = 0;
//            while (n > 0) {
//                int rem = n % 10;
//                if (rem != 0) {
//                    arr[j] = rem;
//                    count++;
//                }
//                n = n / 10;
//                j++;
//            }
//            System.out.println(count);
//            for (int k = 0; k < 5; k++) {
//                if (arr[k] != 0) {
//                    System.out.print(arr[k] * (int) Math.pow(10, k) + " ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}
import java.util.Scanner;

public class SumOfRoundNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int count = 0;
            StringBuilder result = new StringBuilder();

            int placeValue = 1;
            while (n > 0) {
                int rem = n % 10;
                if (rem != 0) {
                    result.insert(0, (rem * placeValue) + " "); // Insert at the beginning
                    count++;
                }
                n = n / 10;
                placeValue *= 10;
            }

            System.out.println(count);
            System.out.println(result.toString().trim()); // Print the final result
        }
        scanner.close();
    }
}

