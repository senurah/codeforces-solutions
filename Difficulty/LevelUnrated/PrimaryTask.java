package Difficulty.LevelUnrated;
//code by senurah
import java.util.Scanner;

public class PrimaryTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        if (t >= 1 && t <= 10000) {
            for (int i = 0; i < t; i++) {
                String [] n  = scanner.nextLine().split("");
                boolean cond = false;

                if((n.length >=3)){
                    if((n[0].equals("1")&& n[1].equals("0") && Integer.valueOf(n[2]) >=2)){
                        cond = true;
                    } else if((n[0].equals("1")&& n[1].equals("0") && Integer.valueOf(n[2]) >= 1 && n.length >3)){
                       cond= true;
                    } else{
                        cond = false;
                    }
                }
                if(cond){
                    System.out.println("YES");
                }else {
                    System.out.println("NO");
                }

            }
        }
    }
}

