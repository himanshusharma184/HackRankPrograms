package random;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CutTheStick {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < a; i++) {
			list.add(scanner.nextInt());
		}
		Collections.sort(list);
		int i = 0;
		while (i < a-1) {
			for (int j = i + 1; j < a; j++) {
				if (list.get(i) == list.get(j)) {
					continue;
				} else {
					System.out.println(a - i);
					i = j;
				}
			}
		}
		if(i==a-1){
			System.out.println("1");
		}
	}

}
