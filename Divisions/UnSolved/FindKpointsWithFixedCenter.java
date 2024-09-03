//package Difficulty.LevelUnrated;
////code by senurah
//import java.util.Scanner;
//
//public class FindKpointsWithFixedCenter {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int t = scanner.nextInt();
//
//        if (t >= 1 && t <= 100) {
//            for (int i = 0; i < t; i++) {
//                int xC= scanner.nextInt();
//                int yC= scanner.nextInt();
//                int k= scanner.nextInt();
//
//
//
//                for(int j= 0 ; j< k; j++){
//                    int xI = xC + j - k/2;
//                    int yI = yC - j - k/2;
//                    System.out.println(xI + " " + yI);
//                }
//
//
//            }
//            scanner.close();
//        }
//    }
//}
package Divisions.UnSolved;
//// code by senurah
//import java.util.Scanner;
//
//public class FindKpointsWithFixedCenter {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int t = scanner.nextInt();
//
//        for (int i = 0; i < t; i++) {
//            int xC = scanner.nextInt();
//            int yC = scanner.nextInt();
//            int k = scanner.nextInt();
//
//            if (k == 1) {
//                System.out.println(xC + " " + yC);
//            } else {
//                for (int j = 0; j < k; j++) {
//                    int xI = xC + j - k / 2;
//                    int yI = yC + (j % 2 == 0 ? j : -j);
//                    System.out.println(xI + " " + yI);
//                }
//            }
//        }
//        scanner.close();
//    }
//}

import java.util.Scanner;
//code by senurah
public class FindKpointsWithFixedCenter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        if (t >= 1 && t <= 100) {
            for (int i = 0; i < t; i++) {
                int xC = scanner.nextInt();
                int yC = scanner.nextInt();
                int k = scanner.nextInt();

                if (k == 1) {
                    System.out.println(xC + " " + yC);
                } else {

                    for (int j = 0; j < k; j++) {
                        int xI = xC + j * 2 - k;
                        int yI = yC + j * 3 - k;

                        if (xI == 0) xI = 1;
                        if (yI == 0) yI = 1;

                        System.out.println(xI + " " + yI);
                    }
                }
            }

        }
        scanner.close();
    }


}

