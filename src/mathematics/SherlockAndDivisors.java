package mathematics;

import java.util.*;

public class SherlockAndDivisors {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int k = 0; k < T; k++) {
			int n = sc.nextInt();

			int cnt = 0;

			while (n % 2 == 0) {
				cnt++;
				n = n / 2;
			}
			if (cnt > 0) {
				for (int p = 3; p <= n; p += 2) {
					int e = 0;
					while (n % p == 0) {
						e++;
						n = n / p;
					}
					cnt *= e + 1;
				}
			}
			System.out.println(cnt);
		}
	}
}
