package interview;

import java.util.*;

public class RemoveDupString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		char[] cc = s.toCharArray();

		int a = 0;
		for (int i = 0; i < cc.length; i++) {
			if ((a & (1 << cc[i])) > 0) {
				cc[i] = 0;
			} else
				a |= (1 << cc[i]);
		}
		System.out.println(Arrays.toString(cc));
		System.out.println(new String(cc));
		for (int i = 0; i < cc.length; i++) {
			if (cc[i] == 0) {
				for (int j = i + 1; j < cc.length; j++) {
					if (cc[j] != 0) {
						cc[i] = cc[j];
						cc[j] = 0;
						break;
					}
				}
			}
		}
		System.out.println(Arrays.toString(cc));
		System.out.print(new String(cc));
	}

}
