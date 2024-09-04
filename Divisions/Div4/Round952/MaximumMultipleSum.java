package Divisions.Div4.Round952;
//code by senurah
import java.util.HashMap;
import java.util.Map;

public class MaximumMultipleSum {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int t = scanner.nextInt();

        if(t >= 1 && t <= 100) {
            for(int i = 0; i < t; i++) {
                int n = scanner.nextInt();
                HashMap<Integer, Integer> map = new HashMap<>();

                for(int j = 2; j <= n; j++) {
                    int sum = 0;
                    for(int m = 1; m * j <= n; m++) {
                        sum += m * j;
                    }
                    map.put(j, sum);
                }

                int maxKey = -1;
                int maxValue = Integer.MIN_VALUE;
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    if (entry.getValue() > maxValue) {
                        maxValue = entry.getValue();
                        maxKey = entry.getKey();
                    }
                }

                System.out.println(maxKey);
            }
        }
    }
}

