package Divisions.Div2.Round244;
//code by senurah
public class PoliceRecruits {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();

        if (n >= 1 && n <= 1000) {
            int count = 0;
            int officers = 0;
            for (int i = 0; i < n; i++) {
                int event = scanner.nextInt();

                if (event == -1) {
                    if (officers == 0) {
                        count++;
                    } else {
                        officers--;
                    }
                } else {
                    officers += event;
                }
            }

            System.out.println(count);
        }

        scanner.close();
    }
}
