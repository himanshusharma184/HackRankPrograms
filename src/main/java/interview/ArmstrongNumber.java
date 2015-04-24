package interview;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		String s = String.valueOf(n);
		int l = s.length();
		int v = 0;
		for (char c : s.toCharArray()) {
			v = (int) (v + Math.pow(Integer.valueOf(String.valueOf(c)), l));
		}
		if (v == n) {
			System.out.println("yup it is");
		} else {
			System.out.println("nope");
		}
	}

}
