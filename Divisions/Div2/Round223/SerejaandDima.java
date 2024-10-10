package Divisions.Div2.Round223;
//code by senurah
public class SerejaandDima {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();

        if (n >= 1 && n <= 1000) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            int sereja = 0;
            int dima = 0;
            int i = 0;
            int j = n - 1;
            boolean isSereja = true;
            while (i <= j) {
                if (isSereja) {
                    if (arr[i] > arr[j]) {
                        sereja += arr[i];
                        i++;
                    } else {
                        sereja += arr[j];
                        j--;
                    }
                } else {
                    if (arr[i] > arr[j]) {
                        dima += arr[i];
                        i++;
                    } else {
                        dima += arr[j];
                        j--;
                    }
                }
                isSereja = !isSereja;
            }

            System.out.println(sereja + " " + dima);
        }

        scanner.close();
    }
}
