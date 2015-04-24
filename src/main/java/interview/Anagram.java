package interview;

import java.util.*;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String t = sc.next();
		int[] a = new int[256];
		int unique = 0;
		for (char c : s.toCharArray()) {
			if (a[(int) c] == 0) {
				unique++;
				a[(int) c] = 1;
			} else
				a[(int) c] = a[(int) c] + 1;
			;
		}
		for (int j = 0; j < t.length(); j++) {
			char c = t.charAt(j);
			if (a[(int) c] == 0) {
				System.out.println("nope");
				return;
			}
			a[(int) c]--;
			if (a[(int) c] == 0) {
				unique--;
				if (unique == 0 && j == t.length() - 1) {
					System.out.println("yeah");
					return;
				}
			}
		}
		System.out.println("nope");
	}

}
