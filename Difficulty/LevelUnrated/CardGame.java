package Difficulty.LevelUnrated;
//code by senurah
import java.util.Scanner;
public class CardGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        if (t >= 1 && t <= 10000) {
            for(int i =0; i<t;i++){
                int a1 = scanner.nextInt();
                int a2 = scanner.nextInt();
                int b1 = scanner.nextInt();
                int b2 = scanner.nextInt();

                int suneetCount = 0;
                if((Math.max(a1,b1)== a1) && (Math.max(a2,b2)== a2)){
                    suneetCount +=2;
                }

                if((Math.max(a2,b1)== a2) && (Math.max(a1,b2)== a1)){
                    suneetCount +=2;
                }

                if((a1==b1)&&(a2==b2)){
                    suneetCount-=2;
                }

                if((a2==b1)&& (a1==b2)){
                    suneetCount-=2;
                }

                System.out.println(suneetCount);

            }
        }

    }


}

