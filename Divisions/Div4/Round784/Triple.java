package Divisions.Div4.Round784;

import java.util.*;
public class Triple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            Map<Integer, Integer> freq = new HashMap<>();
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                freq.put(a[i], freq.getOrDefault(a[i], 0) + 1);
            }
            int result = -1;
            for (int key : freq.keySet()) {
                if (freq.get(key) >= 3) {
                    result = key;
                    break;
                }
            }
            System.out.println(result);
        }
        sc.close();
    }
}
