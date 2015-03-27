package random;

import java.util.*;

public class Meeting {

	public void getMeeting(Map<Integer, Integer> map) {
		TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>(map);
		int count = 1;
		int lastValue = 0;
		for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
			int a = entry.getKey();
			if (a >= lastValue) {
				lastValue = entry.getValue();
				continue;
			} else {
				count++;
				if (lastValue > entry.getValue()) {
					lastValue = entry.getValue();
				}
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int i = sc.nextInt();
		while (i > 0) {
			map.put(sc.nextInt(), sc.nextInt());
			i--;
		}
		Meeting m = new Meeting();
		m.getMeeting(map);
	}

}
