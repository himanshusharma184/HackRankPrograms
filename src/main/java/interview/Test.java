package interview;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Test {
	public void bubble(String s) {
		char[] ch = s.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (ch[j] > ch[j + 1]) {
					char temp = ch[j];
					ch[j] = ch[j + 1];
					ch[j + 1] = temp;
				}
			}
		}
		System.out.println("printing bubble sort");
		System.out.println(ch);
	}

	public static void main(String[] args) {

		int[] a = { 10, 3, 7, 9, 0, 15 };
		int max = 0;
		int beg = 0;
		int end = -1;
		int val = -1;
		int v1 = 0;
		int v2 = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i] > a[i - 1]) {
				end = i;
				max = end - beg;
			} else {
				beg = i;
				end = -1;

			}
			if (max > val) {
				val = max;
				v1 = beg;
				v2 = end;
			}
		}
		System.out.println(v1 + "" + v2);
	}
}
