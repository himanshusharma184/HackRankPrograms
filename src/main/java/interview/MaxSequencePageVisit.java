package interview;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxSequencePageVisit {

	public void getSequence(InputStream input) throws IOException {
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		Map<List<String>, Integer> matcher = new HashMap<List<String>, Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(input));
		String readLine = br.readLine();
		while ((readLine = br.readLine()) != null && !readLine.isEmpty()) {
			// split line
			String[] st = readLine.split("\\s");
			if (st.length < 3) {
				continue;
			}
			// find user in map
			List<String> visitedPage = map.get(st[1]);
			if (visitedPage == null) {
				visitedPage = new ArrayList<String>();
				map.put(st[1], visitedPage);
			}
			// add all page visited by this user in sequence
			// populate map
			visitedPage.add(st[2]);

		}
		// track max occurance of sequence
		int maxUser = 0;
		List<String> result = null;
		// iterate through map's value (list of page visited by each user)
		for (List<String> list : map.values()) {
			// loop through each page till last-3, for purpose of breaking into
			// list of 3 page
			for (int i = 0; i <= list.size() - 3; i++) {
				// create sublist
				List<String> pageSequence = list.subList(i, i + 3);
				// find if this sequence already existing or not
				Integer count = matcher.get(pageSequence);
				if (count == null) {
					matcher.put(pageSequence, count = 0);
				}
				// add counter to this list
				matcher.put(pageSequence, count + 1);
				// check previous max value
				if (count + 1 > maxUser) {
					// if current val is biggest add to result and max
					result = pageSequence;
					maxUser = count + 1;
				}
			}
		}
		System.out.println("Winner is " + maxUser + " times visted page");
		System.out.println(result);

	}

	public static void main(String[] args) throws IOException {
		InputStream fis = new FileInputStream(
				"/Users/himanshusharma/Downloads/Sample.txt");
		MaxSequencePageVisit mfs = new MaxSequencePageVisit();
		mfs.getSequence(fis);
	}
}