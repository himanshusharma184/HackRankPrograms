package string;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sample {

	public int getNumberOfPrimes(int N) {
		int count = -1;
		for (int i = 2; i < N; i++) {
			boolean c = true;
			;
			for (int j = 2; j < i / 2; j++) {
				if (i % j == 0) {
					c = false;
					break;
				}

			}
			if (c) {
				count++;
			}

		}
		return count;
	}

	static String removeDuplicates(String s) {
		StringBuilder noDupes = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			String si = s.substring(i, i + 1);
			if (noDupes.indexOf(si) == -1) {
				noDupes.append(si);
			}
		}
		return noDupes.toString();
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int str = sc.nextInt();

		for (int i = 1; i < 100000; i++) {
			double j = (double) str * (double) i;
			if (j % 10 == 0) {
				String v = String.valueOf(j);
				String pattern = "[2-9]+.*";
				Pattern r = Pattern.compile(pattern);
				Matcher m = r.matcher(v);

				if (!m.find()) {
					v = v.replace("1", "");
					String pattern1 = "[1-9]+.*";
					Pattern r1 = Pattern.compile(pattern1);
					Matcher m1 = r1.matcher(v);
					if (!m1.find()) {
						double d = remind(j);
						if (d == 1) {
							System.out.println(new Double(j).longValue());
							break;
						}
					}
				}
			}
		}

	}

	private static double remind(double j) {
		if (j % 10 == 0) {
			if (j < 9) {
				return j;
			} else if (j / 10 == 1) {
				return j / 10;
			} else {
				if (j / 10 > 10 && j / 10 < 20) {
					return 4;
				} else
					return remind(j / 10);
			}

		}
		return 4;
	}

}
