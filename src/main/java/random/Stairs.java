package random;

import java.util.*;

public class Stairs {

	public HashSet<String> getStairs(int n) {
		ArrayList<HashSet<String>> prevPaths = new ArrayList<HashSet<String>>();

		HashSet<String> st1 = new HashSet<String>();
		st1.add("1");
		if (n == 1)
			return st1;
		prevPaths.add(st1);

		HashSet<String> st2 = new HashSet<String>();
		st2.add("11");
		st2.add("2");
		if (n == 2)
			return st2;
		prevPaths.add(st2);

		for (int i = 3; i <= n; i++) {
			HashSet<String> sti = new HashSet<String>();

			HashSet<String> sti_1 = prevPaths.get(1);
			for (String subPath : sti_1) {
				sti.add("1" + subPath);
				sti.add(subPath + "1");
			}
			HashSet<String> sti_2 = prevPaths.get(0);
			for (String subPath : sti_2) {
				sti.add("2" + subPath);
				sti.add(subPath + "2");
			}

			prevPaths.add(0, prevPaths.get(1));
			prevPaths.add(1, sti);
		}

		return prevPaths.get(1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = sc.nextInt();

		Stairs m = new Stairs();
		System.out.println(Arrays.toString((m.getStairs(i).toArray())));
	}

}
