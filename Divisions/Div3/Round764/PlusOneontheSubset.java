package Divisions.Div3.Round764;
//code by senurah
public class PlusOneontheSubset {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int t = scanner.nextInt();

        if(t >= 1 && t <= 10000) {
            for(int i = 0; i < t; i++) {
                int n = scanner.nextInt();

                if(n >= 1 && n <= 100) {
                    int[] arr = new int[n];
                    for(int j = 0; j < n; j++) {
                        arr[j] = scanner.nextInt();
                    }
                    int max = arr[0];
                    int min = arr[0];
                    for(int j = 1; j < n; j++) {
                        if(arr[j] > max) {
                            max = arr[j];
                        }
                        if(arr[j] < min) {
                            min = arr[j];
                        }
                    }
                    int result = max - min;
                    System.out.println(result);
                }
            }
        }

        scanner.close();
    }
}