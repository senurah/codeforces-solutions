package Divisions.Div4.Round937;
//code according to the provided tutorial
import java.util.HashMap;
import java.util.Scanner;

public class ShufflingSongs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        while (t-- > 0) {
            int n = scanner.nextInt();
            scanner.nextLine();

            HashMap<String, Integer> genreMap = new HashMap<>();
            HashMap<String, Integer> writerMap = new HashMap<>();
            int[][] songs = new int[n][2];

            int genreCount = 0, writerCount = 0;
            for (int i = 0; i < n; i++) {
                String[] songDetails = scanner.nextLine().split(" ");
                String genre = songDetails[0];
                String writer = songDetails[1];

                genreMap.putIfAbsent(genre, genreCount++);
                writerMap.putIfAbsent(writer, writerCount++);

                songs[i][0] = genreMap.get(genre);
                songs[i][1] = writerMap.get(writer);
            }

            int maxMask = 1 << n;
            boolean[][] dp = new boolean[maxMask][n];

            // Initialize the DP table
            for (int i = 0; i < n; i++) {
                dp[1 << i][i] = true;
            }

            int maxSongs = 0;
            for (int mask = 1; mask < maxMask; mask++) {
                for (int last = 0; last < n; last++) {
                    if ((mask & (1 << last)) == 0 || !dp[mask][last]) {
                        continue;
                    }
                    maxSongs = Math.max(maxSongs, Integer.bitCount(mask));
                    for (int next = 0; next < n; next++) {
                        if ((mask & (1 << next)) == 0 &&
                                (songs[next][0] == songs[last][0] || songs[next][1] == songs[last][1])) {
                            dp[mask | (1 << next)][next] = true;
                        }
                    }
                }
            }

            // Output the number of removals needed
            System.out.println(n - maxSongs);
        }
        scanner.close();
    }
}
