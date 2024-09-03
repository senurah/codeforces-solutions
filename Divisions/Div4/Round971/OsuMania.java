package Divisions.Div4.Round971;
//code by senurah
public class OsuMania {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int t = scanner.nextInt();
        if(t>=1 && t<=100){
            for(int i = 0; i<t; i++){
                int n = scanner.nextInt();
                scanner.nextLine();
                int[] result = new int[n];
                for (int j = 0; j < n; j++) {
                    String line = scanner.nextLine();
                    for (int k = 0; k < 4; k++) {
                        if (line.charAt(k) == '#') {
                            result[j] = k + 1;
                            break;
                        }
                    }
                }

                for (int j = n - 1; j >= 0; j--) {
                    System.out.print(result[j]);
                    if (j != 0) {
                        System.out.print(" ");
                    }
                }
                System.out.println();

            }
            scanner.close();


        }

    }


}

