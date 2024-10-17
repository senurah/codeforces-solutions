package Divisions.Div4.Round784;
//code by senurah
public class Division {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int t = scanner.nextInt();

        if(t>=1 && t<=10000){
            for (int i = 0; i < t; i++) {
                int rating = scanner.nextInt();

                if (rating >= 1900) {
                    System.out.println("Division 1");
                } else if (rating >= 1600) {
                    System.out.println("Division 2");
                } else if (rating >= 1400) {
                    System.out.println("Division 3");
                } else {
                    System.out.println("Division 4");
                }
            }
        }

        scanner.close();
    }
}
