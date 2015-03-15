package string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Lonely {

	static int lonelyinteger(int[] a) {
		 
		List<Integer> list = new ArrayList<Integer>();
   for(int j=0;j<a.length;j++){
       list.add(a[j]);
   }
	Collections.sort(list);
	for (int i = 0; i < a.length-1; i = i + 2) {
		if (list.get(i) == list.get(i + 1))
			continue;
		else
		{
			return list.get(i);
		}
	}
	return list.get(list.size()-1);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int res;

		int _a_size = Integer.parseInt(in.nextLine());
		int[] _a = new int[_a_size];
		int _a_item;
		String next = in.nextLine();
		String[] next_split = next.split(" ");

		for (int _a_i = 0; _a_i < _a_size; _a_i++) {
			_a_item = Integer.parseInt(next_split[_a_i]);
			_a[_a_i] = _a_item;
		}

		res = lonelyinteger(_a);
		System.out.println(res);

	}
}
