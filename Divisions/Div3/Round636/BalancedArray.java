package Divisions.Div3.Round636;
//code by senurah
public class BalancedArray {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        if (t >= 1 && t <= 1000) {
            for (int i = 0; i < t; i++) {
                int n = scanner.nextInt();

                if (n % 4 == 0) {
                    System.out.println("YES");

                    int sumEven = 0;
                    for (int j = 2; j <= n; j += 2) {
                        System.out.print(j + " ");
                        sumEven += j;
                    }

                    int sumOdd = 0;
                    for (int j = 1; j < n - 1; j += 2) {
                        System.out.print(j + " ");
                        sumOdd += j;
                    }

                    int lastOdd = sumEven - sumOdd;
                    System.out.println(lastOdd);
                } else {
                    System.out.println("NO");
                }
            }
        }
        scanner.close();
    }
}
