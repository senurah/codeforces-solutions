package Divisions.Div3.Round970;
// code by senurah
public class SquareOrNot {
    public static boolean isSquare(int num) {
        double sqrt = Math.sqrt(num);
        return ((sqrt - Math.floor(sqrt)) == 0) && (Math.pow((int)sqrt, 2) == num);
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        if(t >= 1 && t <= 10000) {
            for(int i = 0; i < t; i++) {
                int n = scanner.nextInt();
                String s = scanner.next();

                if(isSquare(n)) {
                    int size = (int)Math.sqrt(n);
                    boolean isBeautiful = true;

                    for(int row = 0; row < size; row++) {
                        for(int col = 0; col < size; col++) {
                            char currentChar = s.charAt(row * size + col);
                            if((row == 0 || row == size - 1 || col == 0 || col == size - 1)) {
                                if(currentChar != '1') {
                                    isBeautiful = false;
                                    break;
                                }
                            } else {
                                if(currentChar != '0') {
                                    isBeautiful = false;
                                    break;
                                }
                            }
                        }
                        if(!isBeautiful) break;
                    }

                    if(isBeautiful) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
                } else {
                    System.out.println("No");
                }
            }
        }

        scanner.close();
    }
}
