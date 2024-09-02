package Divisions.Div3.Round970;

public class AlternatingString {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        if (t >= 1 && t <= 10000) {
            for (int i = 0; i < t; i++) {
                int n = scanner.nextInt();
                String s = scanner.next();

                int minOperations = Math.min(checkAlternating(s),
                        Math.min(checkAlternating(s.substring(1)),
                                checkAlternating(s.substring(0, n - 1))));

                System.out.println(minOperations);
            }
        }
    }

    private static int checkAlternating(String s) {
        int n = s.length();
        int replaceCount1 = 0;
        int replaceCount2 = 0;

        for (int j = 0; j < n; j++) {
            if (j % 2 == 0) {
                if (s.charAt(j) != s.charAt(0)) {
                    replaceCount1++;
                }
            } else {
                if (s.charAt(j) == s.charAt(0)) {
                    replaceCount1++;
                } else {
                    replaceCount2++;
                }
            }
        }

        return Math.min(replaceCount1, replaceCount2);
    }
}
