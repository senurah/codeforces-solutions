package Divisions.UnSolved;
import java.util.*;

public class LoadedSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            TreeSet<Integer> present = new TreeSet<>();
            TreeSet<Integer> missing = new TreeSet<>();

            for (int i = 1; i <= 2000000; i++) {
                missing.add(i);
            }

            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                present.add(num);
                missing.remove(num);
            }

            int m = sc.nextInt();
            for (int i = 0; i < m; i++) {
                String op = sc.next();
                int x = sc.nextInt();

                if (op.equals("+")) {
                    present.add(x);
                    missing.remove(x);
                } else if (op.equals("-")) {
                    present.remove(x);
                    missing.add(x);
                } else if (op.equals("?")) {
                    System.out.print(missing.ceiling(x) + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
