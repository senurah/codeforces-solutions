package Divisions.Div3.Round693;
//code by senurah
public class FairDivision {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int t = scanner.nextInt();
        if (t >= 1 && t <= 10000) {
            for (int i = 0; i < t; i++) {
                int n = scanner.nextInt();
                if (n >= 1 && n <= 100) {
                    int sum1 = 0;
                    int sum2 = 0;
                    for (int j = 0; j < n; j++) {
                        int x = scanner.nextInt();
                        if (x == 1) {
                            sum1++;
                        } else {
                            sum2++;
                        }
                    }

                    int totalWeight = sum1 + 2 * sum2;
                    if (totalWeight % 2 == 0) {
                        int halfWeight = totalWeight / 2;
                        if (halfWeight % 2 == 0 || (halfWeight % 2 == 1 && sum1 > 0)) {
                            System.out.println("YES");
                        } else {
                            System.out.println("NO");
                        }
                    } else {
                        System.out.println("NO");
                    }
                }
            }
        }
        scanner.close();
    }
}





