package random;

import java.util.Scanner;

public class FilingJars {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long s = scanner.nextLong();
		long p = scanner.nextLong();
		long sum = 0;
		for (long i = 0; i < p; i++) {
			long c = scanner.nextLong();
			long d = scanner.nextLong();
			long f = scanner.nextLong();
			sum += (d - c + 1) * f;
		}
		System.out.println((int) Math.floor(sum / s));

	}

}
