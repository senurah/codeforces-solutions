package Divisions.Div4.Round898;

//code by senurah
public class GoodKid {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            long maxProduct = 0;
            for (int i = 0; i < n; i++) {
                long product = 1;
                for (int j = 0; j < n; j++) {
                    if (j == i) {
                        product *= (arr[j] + 1);
                    } else {
                        product *= arr[j];
                    }
                }
                maxProduct = Math.max(maxProduct, product);
            }
            System.out.println(maxProduct);
        }

        scanner.close();
    }
}
