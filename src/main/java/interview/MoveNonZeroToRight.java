package interview;

import java.util.Arrays;
import java.util.Scanner;

public class MoveNonZeroToRight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] s = new int[a];
		for (int i = 0; i < a; i++) {
			s[i] = sc.nextInt();
		}
		int loop = 0;
		for (int i = 0; i < a; i++) {
			if (s[i] != 0) {
				int t = s[i];
				s[i] = s[loop];
				s[loop++] = t;
			}
		}
		for (; loop < a; loop++) {
			s[loop] = 0;
		}
		System.out.println(Arrays.toString(s));
	}

}
