package mathematics;

import java.util.Scanner;

public class KCandyStore {
    static int M = 1000000000;
    static int[][] tab = new int[1000][1000];
    
    static long newton (int n, int k){
        if(k==0 || k==n) return 1;
        if(tab[n-1][k-1]==0){
            tab[n-1][k-1]=(int)((newton(n-1,k-1)+newton(n-1,k))%M);
        }
        return tab[n-1][k-1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++){
            int N = sc.nextInt();
            int K = sc.nextInt();
            if(K==0){
                System.out.println(N%M);
            }else{
                System.out.println(newton(N+K-1,K)%M);
            }
        }
    }
}
