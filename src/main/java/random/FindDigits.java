package random;

import java.util.Scanner;

public class FindDigits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		for (int i = 0; i < a; i++) {
			int count = 0;
			String b = scanner.next();
			Long long1 = new Long(b);
			for (int j = 0; j < b.length(); j++) {
				if (Character.getNumericValue(b.charAt(j)) != 0
						&& long1 % (Character.getNumericValue(b.charAt(j))) == 0) {
					count++;
				}
			}
			System.out.println(count);
		}

	}

}
