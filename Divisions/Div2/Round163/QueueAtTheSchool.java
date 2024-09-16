package Divisions.Div2.Round163;
//code by senurah
public class QueueAtTheSchool {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        scanner.nextLine();
        if(n>=1 && n<=50 && t>=1 && t<=50){
            String s = scanner.nextLine();
            char[] arr = s.toCharArray();
            for (int i = 0; i < t; i++) {
                for (int j = 0; j < n - 1; j++) {
                    if (arr[j] == 'B' && arr[j + 1] == 'G') {
                        arr[j] = 'G';
                        arr[j + 1] = 'B';
                        j++;
                    }
                }
            }
            System.out.println(new String(arr));
        }
    }
}
