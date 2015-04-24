package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DutchFlag {

	public void swipe(int[] a) {
		int low = 0, mid = 0, high = a.length - 1;
		while (mid <= high) {
			switch (a[mid]) {
			case 0: {
				int t = a[mid];
				a[mid] = a[low];
				a[low] = t;
				low++;
				mid++;
				break;
			}
			case 1: {
				mid++;
				break;
			}
			case 2: {
				int t = a[mid];
				a[mid] = a[high];
				a[high] = t;
				high--;
				break;
			}
			}
		}
		System.out.println("print from new method");
		System.out.println(Arrays.toString(a));
		System.out.println("print from new method");
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new java.util.Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		DutchFlag d = new DutchFlag();
		d.swipe(a);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int low = 0, mid = 0, high = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] == 0) {
				list.add(low, a[i]);
				low++;
				mid++;
				high++;
			} else if (a[i] == 1) {
				list.add(mid, a[i]);
				mid++;
				high++;
			} else {
				list.add(high, a[i]);
				high++;
			}
		}
		System.out.println(list.toString());
	}
}
