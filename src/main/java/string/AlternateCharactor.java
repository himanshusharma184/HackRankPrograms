package string;

import java.util.Scanner;

public class AlternateCharactor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		for (int j = 0; j < a; j++) {
			StringBuilder c = new StringBuilder(scanner.next());
			char p = c.charAt(0);
			int count = 0;
			for (int n = 1; n < c.length(); n++) {
				if (p == c.charAt(n)) {
					count++;
				} else {
					p = c.charAt(n);
				}
			}
			System.out.println(count);
		}
	}

}
