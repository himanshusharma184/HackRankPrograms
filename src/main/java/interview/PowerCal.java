package interview;

import java.util.*;

public class PowerCal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double x = Double.valueOf(sc.next());
		int n = sc.nextInt();
		if (n < 0) {
			System.out.println(1 / find(x, -n));
		}
		System.out.println(find(x, n));

	}

	public static double find(double x, int n) {

		if (n == 0) {
			return 1;
		}
		double v = find(x, n / 2);
		if (n % 2 == 0) {
			return v * v;
		} else {
			return v * v * x;
		}
	}

}
