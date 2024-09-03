package Divisions.UnSolved;

import java.util.Scanner;

public class KleesSuperDuperLargeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();

            long totalSum = (long) k * n + (long) (n - 1) * n / 2;
            long minDifference = Long.MAX_VALUE;

            long prefixSum = 0;

            for (int j = 1; j <= n; j++) {
                prefixSum += k + j - 1;
                long suffixSum = totalSum - prefixSum;
                minDifference = Math.min(minDifference, Math.abs(prefixSum - suffixSum));
            }

            System.out.println(minDifference);
        }

        scanner.close();
    }
}