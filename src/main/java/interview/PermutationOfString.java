package interview;

import java.util.Scanner;

public class PermutationOfString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();

		permutation("", s);
		permuteOfK(s, "", s.length(), 3);

	}

	private static void permuteOfK(String s, String string, int length, int k) {
		if (k == 0) {
			System.out.println(string);
			return;
		}
		for (int i = 0; i < length; ++i) {
			permuteOfK(s, string + s.charAt(i), length, k - 1);
		}

	}

	private static void permutation(String prefix, String str) {
		int n = str.length();
		if (n == 0) {
			System.out.println(prefix);
		} else {
			for (int i = 0; i < n; i++) {
				permutation(prefix + str.charAt(i),
						str.substring(0, i) + str.substring(i + 1, n));
			}
		}

	}

}
