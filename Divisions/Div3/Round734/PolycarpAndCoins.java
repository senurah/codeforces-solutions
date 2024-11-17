package Divisions.Div3.Round734;
//code by senurah
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PolycarpAndCoins {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine().trim());
        StringBuilder output = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(reader.readLine().trim());
            int c2 = n / 3;
            int c1 = n / 3;
            if (n % 3 == 1) {
                c1++;
            } else if (n % 3 == 2) {
                c2++;
            }
            output.append(c1).append(" ").append(c2).append("\n");
        }
        System.out.print(output);
    }
}
