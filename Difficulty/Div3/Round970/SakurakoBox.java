package Difficulty.Div3.Round970;
//code by senurah
import java.util.Scanner;

public class SakurakoBox {
    static final long MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        if (t >= 1 && t <= 10000) {
            for (int i = 0; i < t; i++) {
                int n = scanner.nextInt();
                long[] a = new long[n];
                long sumA = 0;
                long sumA2 = 0;

                for (int j = 0; j < n; j++) {
                    a[j] = scanner.nextLong();
                    sumA = (sumA + a[j]) % MOD;
                    sumA2 = (sumA2 + a[j] * a[j]) % MOD;
                }

                long P = (sumA * sumA - sumA2 + MOD) % MOD;
                P = (P * modInverse(2, MOD)) % MOD;

                long Q = n * (n - 1) / 2;
                long Q_inv = modInverse(Q, MOD);

                long result = (P * Q_inv) % MOD;
                System.out.println(result);
            }
        }
    }

    static long modInverse(long a, long mod) {
        return power(a, mod - 2, mod);
    }

    static long power(long base, long exp, long mod) {
        long result = 1;
        while (exp > 0) {
            if ((exp & 1) != 0) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp >>= 1;
        }
        return result;
    }
}
