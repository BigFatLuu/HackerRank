package mathematics;

import java.util.Scanner;

public class SumarAndTheFloatingRocks {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int T = sc.nextInt();
        for (int k = 0; k < T; k++){
            long x1 = sc.nextLong();
            long y1 = sc.nextLong();
            long x2 = sc.nextLong();
            long y2 = sc.nextLong();
            long dx = Math.abs(x1-x2);
            long dy = Math.abs(y1-y2);
            while(dx!=0 && dy!=0){
                if(dx > dy){
                    long n = dx;
                    dx = dy;
                    dy = n;
                }
                dy = dy%dx;
            }
            long cnt = 0;
            if(dx!=0){
                cnt= dx;
            }else{
                cnt = dy;
            }
            System.out.println(cnt-1);
        }
    }

}
