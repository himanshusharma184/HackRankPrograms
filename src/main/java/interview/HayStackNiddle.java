package interview;

import java.util.*;

public class HayStackNiddle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String k = sc.next();
		String p = sc.next();

		if (k.length() < p.length()) {
			System.out.println("not found");
			System.exit(0);
		}
		for (int i = 0; i < k.length(); i++) {
			if (k.length() - i + 1 < p.length()) {
				System.out.println("not found");
				System.exit(0);
			}
			int j = 0;
			int n = i;
			while (j < p.length() && n < k.length()
					&& k.charAt(n) == p.charAt(j)) {
				j++;
				n++;
				if (j == p.length()) {
					System.out.println("found");
					System.exit(0);
				}
			}

		}

		System.out.println("nah not found");

	}
}