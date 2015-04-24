package interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.google.common.primitives.Chars;

public class AnagramCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		String p = scanner.next();

		List<Character> ch = Chars.asList(s.toCharArray());
		List<Character> cha = Chars.asList(p.toCharArray());
		Collections.sort(ch);
		Collections.sort(cha);
		if (ch.equals(cha)) {
			System.out.print("true");
		} else {
			System.out.print("false");
		}
	}

}
