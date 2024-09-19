package Divisions.Beta.Round57;
//code by senurah
public class UltraFastMathematician {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();

        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == b.charAt(i)) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }
        }
    }
}
