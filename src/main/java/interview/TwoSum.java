package interview;

import java.util.*;

public class TwoSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int s = sc.nextInt();
		int[] a = new int[s];
		for (int i = 0; i < s; i++) {
			a[i] = sc.nextInt();
		}
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int first = -1;
		int last = -1;
		for (int i = 0; i < s; i++) {
			if (map.containsKey(a[i])) {
				first = map.get(a[i]) + 1;
				last = i + 1;
				break;
			} else {
				map.put(k - a[i], i);
			}
		}

		System.out.println("first= " + first + " last is " + last);

	}

}
