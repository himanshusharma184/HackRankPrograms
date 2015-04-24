package interview;

import java.util.*;

public class PascalsTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		ArrayList<Integer> cur = new ArrayList<Integer>();
		cur.add(1);
		System.out.println(Arrays.toString(cur.toArray()));
		for (int i = 2; i < a; i++) {
			ArrayList<Integer> temp = new ArrayList<Integer>();
			temp.add(1);

			for (int j = 0; j < cur.size() - 1; j++) {
				temp.add(cur.get(j) + cur.get(j + 1));
			}
			temp.add(1);

			cur = temp;
			System.out.println(Arrays.toString(temp.toArray()));
		}

	}
}