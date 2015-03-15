package string;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Palindrom {

	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		String inputString = myScan.nextLine();
		Set<Character> charList = new HashSet<Character>();
		for (char c : inputString.toCharArray()) {
			charList.add(c);
		}
		String res="YES";
		Iterator itr = charList.iterator();
		Boolean single = false;
		while (itr.hasNext()) {
			char p = (Character) itr.next();
			int count = 0;
			for (int j = 0; j < inputString.length(); j++) {
				if (p == inputString.charAt(j)) {
					count++;
				}
			}
			if (count % 2 != 0) {
				if (!single) {
					single = true;
				} else {
					res="NO";
				break;
				}
			}

		}

		System.out.println(res);
		myScan.close();

	}

}
