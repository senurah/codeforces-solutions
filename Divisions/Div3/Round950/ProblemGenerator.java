package Divisions.Div3.Round950;
//code by senurah
import java.util.HashMap;
public class ProblemGenerator {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        if (t >= 1 && t <= 1000) {
            for (int i = 0; i < t; i++) {
                int n = scanner.nextInt();
                int m = scanner.nextInt();
                scanner.nextLine();

                String line = scanner.nextLine();

                HashMap<Character, Integer> frequencyMap = new HashMap<>();
                for (char c : line.toCharArray()) {
                    frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
                }

                String requiredDifficulties = "ABCDEFG";
                int additionalProblemsNeeded = 0;

                for (char difficulty : requiredDifficulties.toCharArray()) {
                    int currentCount = frequencyMap.getOrDefault(difficulty, 0);

                    if (currentCount < m) {
                        additionalProblemsNeeded += (m - currentCount);
                    }
                }

                System.out.println(additionalProblemsNeeded);
            }
        }

        scanner.close();
    }
}
