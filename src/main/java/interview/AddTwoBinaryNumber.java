package interview;

import java.util.Scanner;

public class AddTwoBinaryNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		String first = Integer.toBinaryString(a);
		String second = Integer.toBinaryString(b);
		int c = first.length() - 1;
		int d = second.length() - 1;
		int carry = 0;
		StringBuffer br = new StringBuffer();
		while (c >= 0 || d >= 0 || carry > 0) {
			int e = c >= 0 ? first.charAt(c--) - '0' : 0;
			int f = d >= 0 ? second.charAt(d--) - '0' : 0;
			int sum = (e + f + carry) % 2;
			carry = (e + f + carry) / 2;

			br.insert(0, sum);

		}
		System.out.println(br);
		System.out.println(Integer.parseInt(br.toString(), 2));

	}

}
