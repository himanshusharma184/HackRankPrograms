package string;

import java.util.Scanner;

public class BiggerIsGreater {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String[] ss = new String[a];
		for (int i = 0; i < a; i++) {
			ss[i] = sc.next();
		}

		for (String s : ss) {
			Boolean found = false;
			char[] ch = s.toCharArray();
			for (int i = s.length() - 1; i > 0; i--) {
				if (s.charAt(i - 1) < s.charAt(i)) {
					int j = i + 1;
					while (j < s.length()) {
						if (s.charAt(i - 1) < s.charAt(j)
								&& s.charAt(j) < s.charAt(j - 1)) {
							j++;
							continue;
						}
					}
					char temp = ch[i - 1];
					ch[i - 1] = ch[i];
					ch[i] = temp;
					System.out.println(ch);
					found = true;
					break;
				}

				else {
					continue;
				}
			}
			if (!found)
				System.out.println("no answer");
		}
	}

}
