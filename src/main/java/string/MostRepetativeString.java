package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.google.common.primitives.Chars;

public class MostRepetativeString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		char[] b = s.toCharArray();
		Set<Character> charList = new HashSet<Character>(Chars.asList(s
				.toCharArray()));

		Iterator iterator = charList.iterator();
		List<Character> list = new ArrayList<Character>();
		int max = 0;
		while (iterator.hasNext()) {
			int count = 0;
			char c = (Character) iterator.next();
			for (int i = 0; i < s.length(); i++) {
				if (c == b[i]) {
					count++;
				}
			}
			if (count > max) {
				max = count;
				list = new ArrayList<Character>();
				list.add(c);
			} else if (count == max) {
				list.add(c);
			}

		}
		System.out.println(max);
		for(char c:list){
		System.out.println(c);
		}
	}
}
