package string;

import java.util.Scanner;

public class PalindromReCreate {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		for (int i = 0; i < a; i++) {
			String s = scanner.next();
			printNumber(s);
		}
	}

	private static void printNumber(String s) {
		int count = 0;
		StringBuilder builder = new StringBuilder(s);
		for (int i = 0; i < s.length() / 2; i++) {
			if (builder.charAt(i) != builder.charAt(s.length() - 1 - i)) {
				int c=(builder.charAt(s.length() - 1 - i) - builder
						.charAt(i));
				if(c<0){
					c=c*-1;
				}
				count = count+c;
						
			}

		}
	
		System.out.println(count);
	}

}
