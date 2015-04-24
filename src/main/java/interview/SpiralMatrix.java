package interview;

import java.util.*;

public class SpiralMatrix {

	public static void main(String[] args) {
		int m = 10, n = 10;
		int[][] a = new int[m][n];
		int count = 1;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				a[i][j] = ++count;
			}
		}
		int x = 0, y = 0;
		List<Integer> list = new ArrayList<Integer>();

		while (m >= 0 && n >= 0) {
			if (m == 1) {
				for (int i = 0; i < n - 1; i++) {
					list.add(a[x][y++]);
				}
				break;
			}
			if (n == 1) {
				for (int i = 0; i < m - 1; i++) {
					list.add(a[x++][y]);
				}
				break;
			}
			for (int i = 0; i < n - 1; i++) {
				list.add(a[x][y++]);
			}

			for (int i = 0; i < m - 1; i++) {
				list.add(a[x++][y]);
			}

			for (int i = 0; i < n - 1; i++) {
				list.add(a[x][y--]);
			}

			for (int i = 0; i < m - 1; i++) {
				list.add(a[x--][y]);
			}

			x++;
			y++;
			m = m - 2;
			n = n - 2;

		}
		System.out.println(Arrays.toString(list.toArray()));
	}
}
