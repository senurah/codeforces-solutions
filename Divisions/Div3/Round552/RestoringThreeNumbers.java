package Divisions.Div3.Round552;
//code by senurah
public class RestoringThreeNumbers {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        java.util.Arrays.sort(arr);
        int a = arr[3] - arr[0];
        int b = arr[3] - arr[1];
        int c = arr[3] - arr[2];

        System.out.println(a + " " + b + " " + c);
    }
}
