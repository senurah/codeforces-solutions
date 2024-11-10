package Divisions.Beta.Round69;
//code by senurah
public class PanoramixsPrediction {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        if (n >= 2 && n <= 50 && m >= 2 && m <= 50) {
            int nextPrime = 0;
            for (int i = n + 1; i <= m; i++) {
                if (isPrime(i)) {
                    nextPrime = i;
                    break;
                }
            }

            if (nextPrime == m) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


}
