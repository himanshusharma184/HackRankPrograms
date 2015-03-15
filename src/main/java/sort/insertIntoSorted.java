package sort;

import java.util.Arrays;
import java.util.Scanner;

public class insertIntoSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] ar = new int[a];
		for (int i = 0; i < a; i++) {
			ar[i] = sc.nextInt();
		}
		for (int i = ar.length - 1; i > 0; i--) {
			if (ar[i] < ar[i - 1]) {
				int[] p = ar;
				int c = ar[i];
				p[i] = p[i - 1];
				ar[i] = ar[i - 1];
				ar[i - 1] = c;

				System.out.println(Arrays.toString(ar));
			} else {
				System.out.println(Arrays.toString(ar));
			}
		}

	}

}
