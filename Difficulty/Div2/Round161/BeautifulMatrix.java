package Difficulty.Div2.Round161;
//code by senurah
import java.util.Scanner;
public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[5][5];
        int oneRow = 0, oneCol = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = scanner.nextInt();
                if (matrix[i][j] == 1) {
                    oneRow = i;
                    oneCol = j;
                }
            }
        }

        int moves = Math.abs(oneRow - 2) + Math.abs(oneCol - 2);
        System.out.println(moves);
    }
}

