package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class GroupAllAnagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();

		List<ArrayList<String>> res = new ArrayList<ArrayList<String>>();
		String[] s = st.split(",");
		List<String> input = Arrays.asList(s);
		Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		for (String a : input) {
			String b = sort(a);
			if (map.containsKey(b)) {
				map.get(b).add(a);
			} else {
				ArrayList<String> array = new ArrayList<String>();
				array.add(a);
				map.put(b, array);
			}
		}
		for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
			System.out.println("String is " + entry.getKey());
			System.out.println(Arrays.toString(entry.getValue().toArray()));
		}
	}

	private static String sort(String a) {
		char[] c = a.toCharArray();
		Arrays.sort(c);
		return new String(c);
	}

}
