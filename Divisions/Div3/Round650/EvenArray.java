package Divisions.Div3.Round650;
//code by senurah
public class EvenArray {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int t = scanner.nextInt();
        if(t>=1 && t<=1000){
            for(int i =0;i<t;i++){
                int n = scanner.nextInt();
                if(n>=1 && n<=100){
                    int[] arr = new int[n];
                    int even = 0;
                    int odd = 0;
                    for(int j = 0; j < n; j++) {
                        arr[j] = scanner.nextInt();
                        if(j%2 == 0 && arr[j]%2 != 0){
                            even++;
                        }else if(j%2 != 0 && arr[j]%2 == 0){
                            odd++;
                        }
                    }
                    if(even == odd){
                        System.out.println(even);
                    }else{
                        System.out.println(-1);
                    }
                }
            }
        }

    }
}
