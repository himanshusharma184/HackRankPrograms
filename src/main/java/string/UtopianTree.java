package string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class UtopianTree {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		
		
		for (int i = 0; i < t; i++) {
			int size = 1;
			int current = in.nextInt();
			if (current == 0) {
				System.out.println(size);
			} else {
				for (int j = 1; j <= current; j++) {
					if (j % 2 == 0) {
						size++;
					} else {
						size = size * 2;
					}
				}
				System.out.println(size);
			}

		}

	}
}
