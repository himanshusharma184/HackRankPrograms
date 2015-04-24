package interview;

import java.util.*;

public class UniqueChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		int a = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if ((a & (1 << c)) > 0) {
				System.out.println("nah");
				return;
			}
			a |= (1 << c);
		}
		System.out.println("yup it is");
	}

}
