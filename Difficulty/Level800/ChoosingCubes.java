package Difficulty.Level800;

import java.util.Arrays;
import java.util.Scanner;

public class ChoosingCubes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            solve(scanner);
        }
        scanner.close();
    }

    public static void solve(Scanner scanner) {
        int n = scanner.nextInt();
        int f = scanner.nextInt() - 1;
        int k = scanner.nextInt() - 1;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int x = a[f];
        Arrays.sort(a);
        reverseArray(a);

        if (a[k] > x) {
            System.out.println("NO");
        } else if (a[k] < x) {
            System.out.println("YES");
        } else {
            if (k == n - 1 || a[k + 1] < x) {
                System.out.println("YES");
            } else {
                System.out.println("MAYBE");
            }
        }
    }

    public static void reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}
