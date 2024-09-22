package Divisions.Div2.Round141;
//code by senurah
public class Isyourhorseshoeontheotherhoof {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    break;
                }
            }
        }

        System.out.println(count);

    }
}
