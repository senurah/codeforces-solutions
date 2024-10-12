package Divisions.Div3.Round713;
//code by senurah
public class SpyDetected {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }

            int[] count = new int[101];
            for (int j = 0; j < n; j++) {
                count[arr[j]]++;
            }

            int spy = 0;
            for (int j = 0; j < 101; j++) {
                if (count[j] == 1) {
                    spy = j;
                    break;
                }
            }

            for (int j = 0; j < n; j++) {
                if (arr[j] == spy) {
                    System.out.println(j + 1);
                    break;
                }
            }
        }
    }
}
