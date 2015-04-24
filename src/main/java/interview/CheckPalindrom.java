package interview;

import java.util.*;

public class CheckPalindrom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int permitted = 0;
		if (s.length() % 2 != 0) {
			permitted++;
		}

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			Character c = new Character(s.charAt(i));
			if (!map.isEmpty() && map.containsKey(c)) {
				int p = map.get(c);
				map.put(c, ++p);
			}
			else
			{
				map.put(c, 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() % 2 != 0) {
				if (permitted == 0) {
					System.out.println("No it is not");
					System.exit(1);
				} else {
					permitted--;
				}
			}
		}
		System.out.println("it is");
	}
}