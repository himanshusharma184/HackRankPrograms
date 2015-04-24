package interview;

import java.util.Scanner;

public class CheckAllCharUnique {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int i = 0;
		for (int j = 0; j < s.length(); j++) {
			int c = s.charAt(j) - '0';
			if ((i & (1 << c)) > 0) {
				System.out.println("not unique char");
				return;
			} else {
				i |= 1 << c;
			}
		}
		System.out.println("unique char");
	}

}
