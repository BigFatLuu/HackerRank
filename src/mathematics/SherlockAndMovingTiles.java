package mathematics;

import java.util.Scanner;

public class SherlockAndMovingTiles {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double L = scan.nextDouble();
		int S1 = scan.nextInt();
		int S2 = scan.nextInt();
		double diagonal = Math.sqrt(2 * Math.pow(L, 2));
		int Q = scan.nextInt();
		for (int k = 0; k < Q; k++) {
			double area = scan.nextDouble();
			double a = Math.sqrt(2 * area);
			double time = (diagonal - a) / Math.abs(S1 - S2);
			System.out.println(time);
		}
	}
}
