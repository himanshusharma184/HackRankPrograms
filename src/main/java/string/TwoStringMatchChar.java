package string;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class TwoStringMatchChar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		for (int i = 0; i < a; i++) {
			String p = scanner.next();
			String q = scanner.next();
			Set<Character> pSet = getSet(p);
			Set<Character> qSet = getSet(q);
			if (pSet.size() >= qSet.size()) {
				if (find(pSet, qSet)) {
					System.out.println("YES");
				}
				else {
					System.out.println("NO");
				}
			} else {
				if (find(qSet, pSet)) {
					System.out.println("YES");
				}
				else {
					System.out.println("NO");
				}
				
			}
		}

	}

	private static boolean find(Set<Character> pSet, Set<Character> qSet) {
		Iterator iterator= qSet.iterator();
		while(iterator.hasNext()){
			char a=(Character) iterator.next();
			if(pSet.contains(a)){
				return true;
			}
		}
		return false;
	}

	private static Set<Character> getSet(String p) {
		Set<Character> a = new HashSet<Character>();
		for (int i = 0; i < p.length(); i++) {
			a.add(p.charAt(i));
		}
		return a;
	}

}
