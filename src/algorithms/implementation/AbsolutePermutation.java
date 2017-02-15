package algorithms.implementation;

import java.util.Scanner;

public class AbsolutePermutation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			int k = in.nextInt();
			if (k == 0) {
				for (int i = 1; i <= n; i++) {
					System.out.print(i + " ");
				}
			} else if (n % k == 0 && (n / k) % 2 == 0) {
				int j = 1;
				while (j <= n) {
					for (int p = 1; p <= k; p++) {
						System.out.print((j + k) + " ");
						j++;
					}
					for (int p = 1; p <= k; p++) {
						System.out.print((j - k) + " ");
						j++;
					}
				}

			} else {
				System.out.print(-1);
			}
			System.out.println();
		}
	}
}
