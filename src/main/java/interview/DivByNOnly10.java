package interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DivByNOnly10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(11);
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			for (Integer p : list) {
				if (p % n == 0) {
					System.out.println(p);
					System.exit(1);
				}
			}
			int size= list.size();
			for (int j = 0; j <size ; j++) {
				int b = list.get(j);
				StringBuffer buffer = new StringBuffer(b + "1");
				list.add(j, Integer.valueOf(buffer.toString()));
				list.remove(j+1);
				StringBuffer buffer1 = new StringBuffer(b + "0");
				list.add(Integer.valueOf(buffer1.toString()));
			}

		}
	}

}
