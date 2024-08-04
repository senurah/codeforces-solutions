//code by senurah
package Difficulty.LevelUnrated;

import java.util.Scanner;

public class QuestionMarks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        if (t >= 1 && t <= 1000) {
            for (int h = 0; h < t; h++) {
                int n = scanner.nextInt();
                scanner.nextLine();
                String line = scanner.nextLine();
                int aNum = 0, bNum = 0, cNum = 0, dNum = 0, qNum = 0;

                for (char ch : line.toCharArray()) {
                    switch (ch) {
                        case 'A': aNum++;
                            break;
                        case 'B': bNum++;
                            break;
                        case 'C': cNum++;
                            break;
                        case 'D': dNum++;
                            break;
                        case '?': qNum++;
                            break;
                    }
                }



                int aCorrect = Math.min(aNum, n);
                int bCorrect = Math.min(bNum, n);
                int cCorrect = Math.min(cNum, n);
                int dCorrect = Math.min(dNum, n);

                int totalCorrect = aCorrect + bCorrect + cCorrect + dCorrect;

                int aNeeded = n - aCorrect;
                int bNeeded = n - bCorrect;
                int cNeeded = n - cCorrect;
                int dNeeded = n - dCorrect;

                int totalNeeded = aNeeded + bNeeded + cNeeded + dNeeded;

                if (totalNeeded <= qNum) {
                    totalCorrect += totalNeeded;
                } else {
                    totalCorrect += qNum;
                }

                System.out.println(totalCorrect-qNum);
            }
        }
    }
}
