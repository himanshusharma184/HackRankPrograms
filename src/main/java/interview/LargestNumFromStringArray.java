package interview;

import java.util.*;

public class LargestNumFromStringArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		String[] s = new String[a];
		for (int i = 0; i < a; i++) {
			s[i] = sc.next();
		}

		java.util.Arrays.sort(s, new java.util.Comparator<String>() {
			public int compare(String a, String b) {
				String ab = a.concat(b);
				String ba = b.concat(a);
				return ab.compareTo(ba);

			}
		});

		StringBuffer br = new StringBuffer();
		for (int i = a-1; i > -1; i--) {
			br.append(s[i]);
		}
		System.out.println(br.toString());
	}

}
