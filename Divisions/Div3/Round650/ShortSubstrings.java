package Divisions.Div3.Round650;
//code by senurah
public class ShortSubstrings {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        if(t>=1 && t<=1000){
            for (int i = 0; i < t; i++) {
                String s = scanner.nextLine();
                StringBuilder sb = new StringBuilder();
                sb.append(s.charAt(0));
                for (int j = 1; j < s.length() - 1; j += 2) {
                    sb.append(s.charAt(j));
                }
                sb.append(s.charAt(s.length() - 1));
                System.out.println(sb.toString());
            }
        }

    }
}
