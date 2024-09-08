package Divisions.Div4.Round944;
//code by senurah
import java.util.Scanner;
import java.util.Arrays;

public class DifferentString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        if (t >= 1 && t <= 1000) {
            for (int i = 0; i < t; i++) {
                String s = scanner.nextLine();
                boolean allSame = true;

                for (int j = 1; j < s.length(); j++) {
                    if (s.charAt(j) != s.charAt(0)) {
                        allSame = false;
                        break;
                    }
                }

                if (allSame) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                    char[] chars = s.toCharArray();
                    Arrays.sort(chars);

                    if (new String(chars).equals(s)) {
                        for (int j = 1; j < chars.length; j++) {
                            if (chars[j] != chars[0]) {
                                char temp = chars[0];
                                chars[0] = chars[j];
                                chars[j] = temp;
                                break;
                            }
                        }
                    }

                    System.out.println(new String(chars));
                }
            }
        }
        scanner.close();
    }
}

