package algorithms.implementation;

import java.util.Scanner;

public class BiggerIsGreater {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			String text = sc.next();
			int length = text.length();
			int point = -1;
			for (int j = length - 1; j > 0; j--) {
				if (text.charAt(j - 1) < text.charAt(j)) {
					point = j - 1;
					break;
				}
			}
			if (point == -1) {
				System.out.println("no answer");
				continue;
			}
			char cMin = text.charAt(point + 1);
			int iMin = point + 1;
			for (int j = point + 2; j < length; j++) {
				if (text.charAt(point) < text.charAt(j)
						&& cMin > text.charAt(j)) {
					cMin = text.charAt(j);
					iMin = j;
				}
			}
			StringBuilder buff = new StringBuilder(text);
			buff.setCharAt(iMin, text.charAt(point));
			buff.setCharAt(point, cMin);
			for (int x = point + 1; x < length; x++) {
				cMin = buff.charAt(x);
				iMin = x;
				for (int y = x + 1; y < length; y++) {
					if (cMin > buff.charAt(y)) {
						cMin = buff.charAt(y);
						iMin = y;
					}
				}
				buff.setCharAt(iMin, buff.charAt(x));
				buff.setCharAt(x, cMin);
			}
			System.out.println(buff);
		}
	}
}
