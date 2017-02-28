package mathematics;

import java.util.*;

public class EvenOddQuery {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] tab = new int[N + 1];
		for (int p = 1; p < N + 1; p++) {
			tab[p] = scan.nextInt();
		}
		int Q = scan.nextInt();
		for (int k = 0; k < Q; k++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			int check = tab[x];

			if (x < y && tab[x + 1] == 0) {
				check = 1;
			}

			if (check % 2 == 0) {
				System.out.println("Even");
			} else {
				System.out.println("Odd");
			}
		}
	}
}
