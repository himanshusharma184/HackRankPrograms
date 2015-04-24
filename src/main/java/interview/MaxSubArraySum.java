package interview;

import java.util.*;

public class MaxSubArraySum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		int[] s = new int[a];
		for (int i = 0; i < a; i++) {
			s[i] = sc.nextInt();
		}

		int newsum = s[0];
		int max = s[0];
		for (int i = 1; i < s.length; i++) {
			newsum = Math.max(newsum + s[i], s[i]);
			max = Math.max(max, newsum);
		}
		System.out.println(max);

		int glob = s[0];
		int maxv = s[0];
		int minv = s[0];

		for (int i = 1; i < a; i++) {
			int temp = maxv;
			maxv = Math.max(Math.max(maxv * s[i], s[i]), s[i] * minv);
			minv = Math.min(Math.min(s[i] * temp, s[i]), s[i] * minv);
			glob = Math.max(glob, maxv);

		}
		System.out.println(glob);
	}
}
