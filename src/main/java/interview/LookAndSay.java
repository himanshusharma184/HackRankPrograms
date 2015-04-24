package interview;

import java.util.Scanner;

public class LookAndSay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String result = "1";
		int i = 1;
		System.out.println(result);
		while (i < n) {
			StringBuilder sb = new StringBuilder();
			int count = 1;
			for (int j = 1; j < result.length(); j++) {
				if (result.charAt(j) == result.charAt(j - 1)) {
					count++;
				} else {
					sb.append(count);
					sb.append(result.charAt(j - 1));
					count = 1;
				}
			}

			sb.append(count);
			sb.append(result.charAt(result.length() - 1));
			result = sb.toString();
			System.out.println(result);
			i++;
		}
	}

}
