package random;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SherlockTheBeast {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < a; i++) {
			list.add(scanner.nextInt());
		}
		for (int i = 0; i < a; i++) {
			int N = list.get(i);
			if (N % 3 == 0) {
				generateNumber(N, 0);
			} else if (N % 5 == 0) {
				generateNumber(0, N);
			} else if (N < 6) {
				System.out.println(-1);
			} else {
				Boolean found = false;
				int a1 = N / 5;
				for (int p = a1; p > 0; p--) {
					if ((N - p * 5) % 3 == 0) {
						generateNumber((N - p * 5), p*5);
						found = true;
						break;
					}
				}
				if (!found) {
					System.out.println(-1);
				}
			}
		}

	}

	private static void generateNumber(int i, int j) {
		StringBuffer buffer = new StringBuffer();
		while (i > 0) {
			buffer.append("5");
			i--;
		}
		while (j > 0) {
			buffer.append("3");
			j--;
		}
		System.out.println(buffer);

	}

}
