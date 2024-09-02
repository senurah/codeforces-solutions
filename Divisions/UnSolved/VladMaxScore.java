package Divisions.UnSolved;

import java.util.Scanner;

public class VladMaxScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Number of test cases
        int t = scanner.nextInt();

        while (t-- > 0) {
            // Length of the strip
            int n = scanner.nextInt();
            int[] a = new int[n];

            // The array of integers
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            // The string of 'L' and 'R'
            String s = scanner.next();

            int maxScore = 0;
            int[] prefixSum = new int[n + 1];

            // Calculate prefix sums for the array a
            for (int i = 0; i < n; i++) {
                prefixSum[i + 1] = prefixSum[i] + a[i];
            }

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'L') {
                    for (int j = i + 1; j < n; j++) {
                        if (s.charAt(j) == 'R') {
                            maxScore += prefixSum[j + 1] - prefixSum[i];
                            s = s.substring(0, i) + ".".repeat(j - i + 1) + s.substring(j + 1);
                            i = j;
                            break;
                        }
                    }
                }
            }

            System.out.println(maxScore);
        }
    }
}
