package interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MostRepetativeChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int count = 1;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
				if (map.get(s.charAt(i)) > count) {
					count = map.get(s.charAt(i));
				}
			} else {
				map.put(s.charAt(i), 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == count) {
				System.out.println(entry.getKey());
			}
		}
	}
}
