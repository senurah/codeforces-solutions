package Divisions.Technocup2019;
//code by senurah
public class InSearchOfAnEasyProblem {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        if (n >= 1 && n <= 100) {
            String line = scanner.nextLine();
            String[] difficulties = line.split(" ");

            boolean isHard = false;
            for (String difficulty : difficulties) {
                if (difficulty.equals("1")) {
                    isHard = true;
                    break;
                }
            }

            if (isHard) {
                System.out.println("HARD");
            } else {
                System.out.println("EASY");
            }
        }

        scanner.close();
    }
}
