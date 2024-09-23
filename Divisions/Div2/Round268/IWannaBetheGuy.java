package Divisions.Div2.Round268;
//code by senurah
public class IWannaBetheGuy {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();
        int[] x = new int[p];
        for (int i = 0; i < p; i++) {
            x[i] = scanner.nextInt();
        }
        int q = scanner.nextInt();
        int[] y = new int[q];
        for (int i = 0; i < q; i++) {
            y[i] = scanner.nextInt();
        }

        boolean[] levels = new boolean[n];
        for (int i = 0; i < p; i++) {
            levels[x[i] - 1] = true;
        }
        for (int i = 0; i < q; i++) {
            levels[y[i] - 1] = true;
        }

        boolean canPass = true;
        for (int i = 0; i < n; i++) {
            if (!levels[i]) {
                canPass = false;
                break;
            }
        }

        if (canPass) {
            System.out.println("I become the guy.");
        } else {
            System.out.println("Oh, my keyboard!");
        }

        scanner.close();
    }
}
