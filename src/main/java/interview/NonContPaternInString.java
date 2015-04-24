package interview;

import java.util.Scanner;

//not working
public class NonContPaternInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		StringBuilder b = new StringBuilder(s);

		for (int i = 0; i < b.length(); i++) {
			int a = b.indexOf(b.substring(i, i + 1));
			int c = b.lastIndexOf(b.substring(i, i + 1));
			if (a == c) {
				continue;
			} else {
				for (int j = i + 1; j < b.length(); j++) {
					int e = b.indexOf(b.substring(j, j + 1));
					int f = b.indexOf(b.substring(j, j + 1));
					if (c > e && c < f) {
						System.out.println("yup");
						return;
					}
				}
			}
		}
		System.out.println("nope");
		return;

	}

}
