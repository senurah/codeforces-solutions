package Divisions.UnSolved;
//code by senurah
import java.util.Scanner;
import java.util.HashSet;
public class SeatingInABus2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        if (t >= 1 && t <= 10000) {
            for (int i = 0; i < t; i++) {
                int n = scanner.nextInt();
                HashSet<Integer> set = new HashSet<>();
                boolean cond = true;

                for (int h = 0; h < n; h++) {
                    int input = scanner.nextInt();
                    int temp = input+1;
                    int temp2 = input-1;
//                    if ((!set.contains(temp) && !set.contains(temp2)) && h > 0) {
//                        set.add(input);
//                    }else if(h==0){
//                        set.add(input);
//                    } else {
//                        cond = false;
//                        break;
//                    }
                    if ((set.contains(temp) || set.contains(temp2)) || h == 0) {
                        set.add(input);
                    } else {
                        cond = false;
                        break;
                    }


                }
                //System.out.println(set);
                if (cond) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
