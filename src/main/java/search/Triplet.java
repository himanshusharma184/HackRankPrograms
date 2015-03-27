package search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Triplet {

	public static void main(String args[]) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			list.add(scn.nextInt());
		}

		Collections.sort(list);
		Set<Integer> set = new HashSet<Integer>(list);
		list.clear();
		int triplets = set.size();
		for (int i = set.size() - 1; i > 3; i--) {
			triplets = triplets * i;
		}
		// Write the code to compute the number of triplets as required
		System.out.println(triplets);
	}

}
