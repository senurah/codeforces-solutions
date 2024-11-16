package Divisions.Div4.Round817;
//code by senurah
import java.util.Arrays;
public class SpellCheck {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int t = scanner.nextInt();
        String valid = "Timur";
        char[] validChars = valid.toCharArray();
        Arrays.sort(validChars);

        if (t>=1 && t<= 1000){
            for (int i =0;i<t;i++) {
                int n = scanner.nextInt();
                String s = scanner.next();
                if (n != 5) {
                    System.out.println("NO");
                    continue;
                }
                char[] sChars = s.toCharArray();
                Arrays.sort(sChars);
                if (Arrays.equals(sChars, validChars)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
            scanner.close();

        }

    }
}
