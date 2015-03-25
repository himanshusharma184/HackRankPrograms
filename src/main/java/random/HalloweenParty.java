package random;

import java.util.Scanner;

public class HalloweenParty {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		for (int i = 0; i < a; i++) {
			long b = scanner.nextLong();
			if (b % 2 == 0) {
				System.out.println((b / 2) * (b / 2));
			} else {
				System.out.println((b / 2 + 1) * (b / 2));
			}
		}

	}

}
