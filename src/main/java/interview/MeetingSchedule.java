package interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MeetingSchedule {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		List<Schedule> list = new ArrayList<Schedule>();
		for (int i = 0; i < a; i++) {
			Schedule sc = new Schedule(scanner.nextInt(), scanner.nextInt());
			list.add(sc);
		}
		Collections.sort(list, new Comparator<Schedule>() {
			public int compare(Schedule o1, Schedule o2) {
				return o1.start - o2.start;
			}

		});
		// number of meeting room require
		int prev = 0;
		int count = 1;
		for (Schedule schedule : list) {
			if (schedule.start < prev) {
				count++;
				if (schedule.end < prev) {
					prev = schedule.end;
				}
			} else {
				prev = schedule.end;
			}
		}

		System.out.println(count);

	}
}

class Schedule {

	int start;
	int end;

	public Schedule(int start, int end) {
		this.start = start;
		this.end = end;

	}
}
