package algorithms.implementation;

import java.util.Scanner;

public class TheGridSearch {
	static boolean test(int rows1, int columns1, String[] table1,
			String[] table2) {
		int rows2 = table2.length;
		int columns2 = table2[0].length();
		for (int i = 0; i <= rows1 - rows2; i++) {
			for (int j = 0; j <= columns1 - columns2; j++) {
				if (check(i, j, table1, table2)) {
					return true;
				}
			}
		}
		return false;
	}

	static boolean check(int x, int y, String[] table1, String[] table2) {
		int rows2 = table2.length;
		int columns2 = table2[0].length();
		for (int s = 0; s < rows2; s++) {
			for (int d = 0; d < columns2; d++) {
				if (table2[s].charAt(d) != table1[s + x].charAt(d + y)) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int k = 0; k < t; k++) {
			int rows1 = sc.nextInt();
			int columns1 = sc.nextInt();
			String[] table1 = new String[rows1];
			for (int p = 0; p < rows1; p++) {
				table1[p] = sc.next();
			}
			int rows2 = sc.nextInt();
			String[] table2 = new String[rows2];
			for (int p = 0; p < rows2; p++) {
				table2[p] = sc.next();
			}
			if (test(rows1, columns1, table1, table2)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
