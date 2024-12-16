package Divisions.Div4.Round827;

//code by senurah
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Increasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            Set<Integer> uniqueElements = new HashSet<>();

            boolean hasDuplicate = false;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (!uniqueElements.add(arr[i])) {
                    hasDuplicate = true;
                }
            }
            if (hasDuplicate) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }

        sc.close();

    }
}
