package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxMin {

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		int K = Integer.parseInt(in.readLine());
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < N; i++)
			list.add(Integer.parseInt(in.readLine()));

		int unfairness = Integer.MAX_VALUE;
		Collections.sort(list);
		/*
		 * Write your code here, to process numPackets N, numKids K, and the
		 * packets of candies Compute the ideal value for unfairness over here
		 */
		int c = list.get(K-1) - list.get(0);
		for (int i = 0; i < list.size() - K + 1; i++) {
			if (list.get(i+K - 1) - list.get(i) < c) {
				c = list.get(i+K - 1) - list.get(i);
			}
		}
	
		unfairness = c;
		System.out.println(unfairness);
	}
}
