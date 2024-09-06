package Divisions.Beta.Round4;
//code by senurah
public class BeforeAnExam {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int d = scanner.nextInt();
        int sumTime = scanner.nextInt();
        int[] minTimes = new int[d];
        int[] maxTimes = new int[d];
        int minTotal = 0;
        int maxTotal = 0;
        for (int i = 0; i < d; i++) {
            minTimes[i] = scanner.nextInt();
            maxTimes[i] = scanner.nextInt();
            minTotal += minTimes[i];
            maxTotal += maxTimes[i];
        }

        if (sumTime < minTotal || sumTime > maxTotal) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            int[] schedule = new int[d];

            for (int i = 0; i < d; i++) {
                schedule[i] = minTimes[i];
            }

            int remainingTime = sumTime - minTotal;

            for (int i = 0; i < d && remainingTime > 0; i++) {
                int availableTime = maxTimes[i] - minTimes[i];
                int timeToAdd = Math.min(remainingTime, availableTime);
                schedule[i] += timeToAdd;
                remainingTime -= timeToAdd;
            }

            for (int i = 0; i < d; i++) {
                System.out.print(schedule[i] + " ");
            }
        }
    }
}
