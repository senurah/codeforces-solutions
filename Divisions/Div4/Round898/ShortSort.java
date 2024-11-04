package Divisions.Div4.Round898;
//code by senurah
public class ShortSort {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        if(t>=1 && t<=6) {
            for (int i = 0; i < t; i++) {
                String s = scanner.nextLine();
                if(s.equals("bca") ||s.equals("cab")){
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
                //bca - NO
                //cab - NO
            }
        }
    }
}
