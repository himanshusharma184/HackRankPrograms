package interview;

import java.util.Scanner;

public class NumberToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuilder b = new StringBuilder();
		while (n > 0) {
			b.append(n % 2);
			n /= 2;
		}
		System.out.print(b.reverse());
	}

}
