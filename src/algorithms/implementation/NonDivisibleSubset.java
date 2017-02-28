package algorithms.implementation;

import java.util.Scanner;

public class NonDivisibleSubset {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] table = new int[k];
		int subset = 0;
		for (int i = 0; i < n; i++) {
			int ai = sc.nextInt() % k;
			table[ai]++;
		}
		for (int i = 0; i <= k / 2; i++) {
			int r = (k - i) % k;
			if (i == r) {
				subset += Math.min(table[i], 1);
			} else {
				subset += Math.max(table[i], table[r]);
			}
		}
		System.out.print(subset);
	}
}
