package random;

import java.util.Scanner;

public class ChocolateFeast {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			System.out.println(Solve(in.nextInt(), in.nextInt(), in.nextInt()));
		}
	}

	private static long Solve(int N, int C, int M) {
		int c = N / C;
		int count = 0;
		count = c + c / M;
		int wrapLeft = c - (c / M) * M;
		int p = c / M;
		while (p >= M) {
			int t = p / M;
			count += t;
			p = p - t * M + t;
		}
		if ((p + wrapLeft) >= M) {
			count += (p + wrapLeft) / M;
		}
		return (long) count;
	}
}
