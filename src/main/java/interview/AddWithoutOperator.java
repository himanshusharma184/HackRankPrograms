package interview;

import java.util.Scanner;

public class AddWithoutOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println(sum(a, b));

	}

	private static int sum(int a, int b) {
		if (b == 0) {
			return a;
		}
		return sum(a ^ b, (a & b) << 1);
	}

}
