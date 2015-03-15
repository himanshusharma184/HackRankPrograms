package string;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char[] a = sc.nextLine().toCharArray();
		// char[] b = sc.nextLine().toCharArray();
		int count = 0;

		StringBuilder builder = new StringBuilder(sc.nextLine());
		for (char c : a) {
			if (builder.length() > -1) {
				int i = builder.indexOf(String.valueOf(c));
				if (i > -1) {
					builder.deleteCharAt(i);
				} else {
					count++;
				}
			} else {
				count++;
			}

		}
		if (builder.length() > -1) {
			System.out.println(count + builder.length());
		} else
			System.out.println(count);

	}

}
