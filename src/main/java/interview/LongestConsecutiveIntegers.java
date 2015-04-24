package interview;

import java.util.*;

public class LongestConsecutiveIntegers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int[] a = new int[k];

		for (int i = 0; i < k; i++) {
			a[i] = sc.nextInt();
		}
		java.util.Arrays.sort(a);
		Set<Integer> set = new HashSet<Integer>();
		for (int i : a) {
			set.add(i);
		}
		int max = 1;
		for (int i : a) {
			int left = i - 1;
			int right = i + 1;
			int count = 1;

			while (set.contains(left)) {
				count++;
				set.remove(left);
				left--;

			}
			while (set.contains(right)) {
				count++;
				set.remove(right);
				right++;
			}
			max = Math.max(count, max);

		}
		System.out.println("found " + max);
	}
}
