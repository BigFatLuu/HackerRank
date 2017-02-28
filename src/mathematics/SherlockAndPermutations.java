package mathematics;

import java.io.*;
import java.util.*;

public class SherlockAndPermutations {

	static int M = 1000000007;
	static int[][] tab = new int[2000][1000];

	static long newton(int n, int k) {
		if (k == 0 || k == n)
			return 1;
		if (tab[n - 1][k - 1] == 0) {
			tab[n - 1][k - 1] = (int) ((newton(n - 1, k - 1) + newton(n - 1, k)) % M);
		}
		return tab[n - 1][k - 1];
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int p = 0; p < T; p++) {
			int n = sc.nextInt();
			int m = sc.nextInt() - 1;
			System.out.println(newton(n + m, n));

		}
	}
}
