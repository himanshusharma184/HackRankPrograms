package interview;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class StringPartOfString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		String t = scanner.next();
		Set<Character> setA = new HashSet<Character>();
		for (char c : s.toCharArray()) {
			setA.add(c);
		}
		for (char c : t.toCharArray()) {
			if (!setA.contains(c)) {
				System.out.println("nope");
				return;
			}
		}
		System.out.println("yup");
	}

}
