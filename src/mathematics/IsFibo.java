package mathematics;

import java.util.Scanner;

public class IsFibo {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int T = sc.nextInt();
        long[] fibo = new long[50];
        fibo[0]=0;
        fibo[1]=1;
        for (int p = 2; p < 50; p++){
            fibo[p]= fibo[p-1]+fibo[p-2];
        } 
        for(int i = 0; i < T; i++){
            long N = sc.nextLong();
            boolean isit = false;
            for (int j = 2; j < fibo.length; j++){
                if(N==fibo[j]){
                    isit = true;
                    break;
                }
            }
            if(isit){
                System.out.println("IsFibo");
            }else{
                System.out.println("IsNotFibo");
            }
        }   
    }

}
