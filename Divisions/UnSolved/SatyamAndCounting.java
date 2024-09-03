package Divisions.UnSolved;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SatyamAndCounting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();

            Map<Integer, Integer> xCount = new HashMap<>();
            Map<Integer, Integer> yCount = new HashMap<>();
            int[][] points = new int[n][2];

            for (int j = 0; j < n; j++) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                points[j][0] = x;
                points[j][1] = y;

                xCount.put(x, xCount.getOrDefault(x, 0) + 1);
                yCount.put(y, yCount.getOrDefault(y, 0) + 1);
            }

            int result = 0;

            for (int j = 0; j < n; j++) {
                int x = points[j][0];
                int y = points[j][1];

                int vx = xCount.get(x);
                int hy = yCount.get(y);

                result += (vx - 1) * (hy - 1);
            }

            System.out.println(result);
        }

        scanner.close();
    }
}
