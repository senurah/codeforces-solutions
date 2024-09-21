package Divisions.Div3.Round974;
//code by senurah
public class RobinHelps {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int t = scanner.nextInt();
        if(t>=1 && t <= 10000){
            for(int l = 0; l < t; l++){
                int n = scanner.nextInt();
                int k = scanner.nextInt();
                if((n>=1 && n<=50) && (k>=1 && k<=100)){
                    int[] arr = new int[n];
                    for (int i = 0; i < n; i++) {
                        arr[i] = scanner.nextInt();
                    }

                    int coins = 0;
                    int count = 0;

                    for (int i = 0; i < n; i++) {
                        if (arr[i] >= k) {
                            coins += arr[i];
                        } else if (arr[i] == 0 && coins > 0) {
                            coins--;
                            count++;
                        }
                    }

                    System.out.println(count);


                }

            }


        }

    }
}

