package interview;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueSubSetString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Set<String> set = new HashSet<String>();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				String sb = s.substring(i, j + 1);
				set.add(sb);
			}
		}
		for (String ss : set) {
			System.out.println(ss);
		}

	}

}
