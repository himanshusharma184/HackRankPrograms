package string;

import java.util.Scanner;

public class PalindromIndex {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		for (int i = 0; i < a; i++) {
			String p = scanner.next();
			for (int j = 0; j < p.length(); j++) {

				StringBuilder b = new StringBuilder(p);
				String f = b.deleteCharAt(j).toString();
				if (isPaindrom(f)) {
					System.out.println(j);
				}
			}
			System.out.println("-1");
		}

	}

	private static boolean isPaindrom(String f) {
		for (int i = 0; i < f.length() / 2; i++) {
			if (f.charAt(i) != f.charAt(f.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}
}
