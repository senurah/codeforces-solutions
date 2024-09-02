package Divisions.Beta.Round84;
//code by senurah
public class NearlyLuckyNumber {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String number = scanner.next();
        int count = 0;
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '4' || number.charAt(i) == '7') {
                count++;
            }
        }
        if (count == 4 || count == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        scanner.close();
    }
}
