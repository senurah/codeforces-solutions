package Difficulty.Div3.Round970;
//code by senurah
public class SakurakosExam {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int t = scanner.nextInt();
        if(t>=1 && t<=100){
            for(int i = 0; i<t; i++){
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                if(a>=0 && a<=100 && b>=0 && b<=100){
//                    if(a%2==0 && b%2==0) {
//                        System.out.println("YES");
//                    } else if (((b % 2) * 2) == (a % 2) || (((b % 2) * 2) == (a))) {
//                        System.out.println("YES");
//                    } else {
//                        System.out.println("NO");
//                    }
                    if ((a + 2 * b) % 2 == 0 && (a != 0 || b % 2 == 0)) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }


            }
        }

    }
}
