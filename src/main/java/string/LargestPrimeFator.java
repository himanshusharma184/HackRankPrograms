package string;

import java.util.Scanner;

public class LargestPrimeFator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();

		if (prime(a)) {
			System.out.println(a);
		} else {
			for (int i = a / 2; i > 1; i--) {
				if (a % i == 0) {
					if (prime(i)) {
						System.out.println(i);
						break;
					}
				}

			}
		}
	}

	private static boolean prime(int a) {
		if (a == 2) {
			return true;
		}
		for (int i = 2; i < a / 2 + 1; i++) {
			if (a % i == 0) {
				return false;
			}

		}
		return true;
	}

}
