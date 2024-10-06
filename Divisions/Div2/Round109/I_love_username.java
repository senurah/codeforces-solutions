package Divisions.Div2.Round109;
//code by senurah
public class I_love_username {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                count++;
            } else if (arr[i] < min) {
                min = arr[i];
                count++;
            }
        }

        System.out.println(count);
    }
}
