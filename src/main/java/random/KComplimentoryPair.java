package random;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class KComplimentoryPair {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//k value
		int k = scanner.nextInt();
		//size of array
		int a = scanner.nextInt();
		//array values
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < a; i++) {
			list.add(scanner.nextInt());
		}
		Map<Integer, Integer> holder = new HashMap<Integer, Integer>();
		int output = 0;
		for (int i = 0; i < list.size(); i++) {
			int val = k - list.get(i);
			if (holder.containsKey(val)) {
				int value = holder.get(val);
				holder.put(val, value + 1);
			} else {
				holder.put(val, 1);
			}
		}

		for (int i = 0; i < list.size(); i++) {
			if (holder.containsKey(list.get(i))) {
				output += holder.get(list.get(i));
			}
		}
		System.out.println(output);
	}
}
