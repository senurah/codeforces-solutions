package Divisions.Div4.Round937;
//code by senurah
public class ClockConversion {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int t = scanner.nextInt();
        if(t>=1 && t<=1440){
            for(int i=0 ;i<t;i++){
                String [] time = scanner.next().split(":");
                int h = Integer.parseInt(time[0]);
                int m = Integer.parseInt(time[1]);
                if(h==0 && m<=59){
                    System.out.println(12+":"+normalization(12,m)[1]+" AM");
                }else if(h==12 && m<=59) {
                    System.out.println(12 + ":" + normalization(12, m)[1] + " PM");
                }else{
                    if(h>12){
                        System.out.println(normalization(h-12,m)[0]+":"+normalization(h-12,m)[1]+" PM");
                    }else{
                        System.out.println(normalization(h,m)[0]+":"+normalization(h,m)[1]+" AM");
                    }
                }
            }
        }
    }

    public static String [] normalization(int h,int m){
        String hour = String.valueOf(h);
        String minute = String.valueOf(m);
        if(h<10){
            hour = "0"+h;
        }
        if (m < 10) {
            minute = "0" + m;
        }
        return new String[]{hour,minute};
    }
}
