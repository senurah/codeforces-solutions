package Divisions.Div4.Round871;
//code by senurah
import java.util.Scanner;

public class BlankSpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for(int i = 0; i< t; i++){
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for(int j = 0 ; j < n ; j++){
                arr[j] = scanner.nextInt();
            }

            int max = 0;
            int temp = 0;
            for (int z = 0; z< n; z++){
                if(arr[z] == 0){
                    temp++;
                    if (temp> max){
                        max = temp;
                    }
                } else {
                    temp=0;
                }
            }
            System.out.println(max);
        }
    }
}

