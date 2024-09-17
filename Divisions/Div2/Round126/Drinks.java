package Divisions.Div2.Round126;
//code by senurah
public class Drinks {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        if(n>=1 && n<=100){
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            double sum = 0;
            for (int i = 0; i < n; i++) {
                sum += arr[i];
            }
            System.out.println(sum/n);
        }
    }
}
