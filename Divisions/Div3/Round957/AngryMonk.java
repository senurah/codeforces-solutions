package Divisions.Div3.Round957;
//code by senurah
public class AngryMonk {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int t = scanner.nextInt();
        if(t >= 1 && t <= 10000){
            for(int i = 0; i < t; i++){
                int n = scanner.nextInt();
                int k = scanner.nextInt();

                int[] a = new int[k];
                for(int j = 0; j < k; j++){
                    a[j] = scanner.nextInt();
                }
                int max = Integer.MIN_VALUE;
                int maxIndex = -1;
                for (int h = 0; h < k; h++) {
                    if (a[h] > max) {
                        max = a[h];
                        maxIndex = h;
                    }
                }

                int totCal = 0;
                for(int b = 0; b < k; b++){
                    if(b != maxIndex){
                        if(a[b] != 1){
                            totCal += a[b] * 2 - 1;
                        } else {
                            totCal += 1;
                        }
                    }
                }

                System.out.println(totCal);
            }
        }
    }
}
