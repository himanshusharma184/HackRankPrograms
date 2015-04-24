package interview;

import java.util.Scanner;

public class SingleNumberFromListWTwiceNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int[] s = new int[a];
		for (int i = 0; i < a; i++) {
			s[i] = sc.nextInt();
		}

		int val = 0;
		for (int i : s) {
			val = val ^ i;
		}
		System.out.println(val);
	}

	public int singleNumber(int[] A) {
		int ones = 0, twos = 0, threes = 0;
		for (int i = 0; i < A.length; i++) {
			twos |= ones & A[i];
			ones ^= A[i];
			threes = ones & twos;
			ones &= ~threes;
			twos &= ~threes;
		}
		return ones;
	}

}
