package interview;

import java.util.Scanner;

public class SquareRootWithoutOperator {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		int i = a / 2;
		int temp;
		do {
			temp = i;
			i = (temp + (a / temp)) / 2;
		} while (i - temp != 0);
		System.out.println(i);
	}

}
