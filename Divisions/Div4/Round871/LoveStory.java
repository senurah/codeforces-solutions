package Divisions.Div4.Round871;

//code by senurah
public class LoveStory {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        String target = "codeforces";
        if (t>=1 && t<=1000){
            for (int i = 0; i < t; i++) {
                String s = scanner.nextLine();
                int differences = 0;
                for (int j = 0; j < target.length(); j++) {
                    if (s.charAt(j) != target.charAt(j)) {
                        differences++;
                    }
                }
                System.out.println(differences);
            }

        }
        scanner.close();
    }
}

