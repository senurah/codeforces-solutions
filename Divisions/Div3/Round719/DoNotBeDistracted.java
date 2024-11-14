package Divisions.Div3.Round719;
//code by senurah
public class DoNotBeDistracted {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int t = scanner.nextInt();
        if(t>=1 && t<=1000){
            for(int i =0;i<t;i++){
                int n = scanner.nextInt();
                if(n>=1 && n<=100){
                    String s = scanner.next();
                    boolean[] visited = new boolean[26];
                    boolean flag = true;
                    char prev = s.charAt(0);
                    visited[prev - 'A'] = true;
                    for(int j = 1; j < n; j++) {
                        char curr = s.charAt(j);
                        if(curr != prev) {
                            if(visited[curr - 'A']) {
                                flag = false;
                                break;
                            }
                            visited[curr - 'A'] = true;
                            prev = curr;
                        }
                    }
                    if(flag) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }
            }
        }
    }
}
