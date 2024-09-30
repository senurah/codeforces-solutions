package Divisions.Div2.Round375;
//code by senurah
public class TheNewYearMeetingFriends {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int[] ox = new int[3];
        for (int i = 0; i < ox.length; i++) {
            ox[i] = scanner.nextInt();
        }

        java.util.Arrays.sort(ox);
        System.out.println(ox[2] - ox[0]);
    }
}
