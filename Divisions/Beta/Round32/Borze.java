package Divisions.Beta.Round32;
//code by senurah
public class Borze {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String s = scanner.next();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.') {
                sb.append("0");
            } else if (s.charAt(i) == '-' && s.charAt(i + 1) == '.') {
                sb.append("1");
                i++;
            } else if (s.charAt(i) == '-' && s.charAt(i + 1) == '-') {
                sb.append("2");
                i++;
            }
        }

        System.out.println(sb.toString());
    }
}
