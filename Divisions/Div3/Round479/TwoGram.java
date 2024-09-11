package Divisions.Div3.Round479;
//code by senurah
public class TwoGram {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        if(n>=2 && n<=100){
            String line = scanner.nextLine();

            int maxCount = 0;
            String maxTwoGram = "";
            for (int i = 0; i < n - 1; i++) {
                String twoGram = line.substring(i, i + 2);
                int count = 0;
                for (int j = 0; j < n - 1; j++) {
                    if (line.substring(j, j + 2).equals(twoGram)) {
                        count++;
                    }
                }

                if (count > maxCount) {
                    maxCount = count;
                    maxTwoGram = twoGram;
                }
            }

            System.out.println(maxTwoGram);

        }

    }
}
