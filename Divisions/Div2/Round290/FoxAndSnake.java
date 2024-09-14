package Divisions.Div2.Round290;
//code by senurah
public class FoxAndSnake {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        if (n >= 1 && n <= 50 && m >= 1 && m <= 50) {
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    for (int j = 0; j < m; j++) {
                        System.out.print("#");
                    }
                } else {
                    if (i % 4 == 1) {
                        for (int j = 0; j < m - 1; j++) {
                            System.out.print(".");
                        }
                        System.out.print("#");
                    } else {
                        System.out.print("#");
                        for (int j = 0; j < m - 1; j++) {
                            System.out.print(".");
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}
