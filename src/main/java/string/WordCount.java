package string;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class WordCount {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		RandomAccessFile aFile = new RandomAccessFile(sc.next(), "r");
		FileChannel inChannel = aFile.getChannel();
		MappedByteBuffer buffer = inChannel.map(FileChannel.MapMode.READ_ONLY,
				0, inChannel.size());
		buffer.load();
		StringBuffer buffer2 = new StringBuffer();
		for (long i = 0; i < buffer.limit(); i++) {
			buffer2.append((char) buffer.get());
		}

		Map<String, Long> wordCount = new HashMap<String, Long>();

		String[] c = buffer2.toString().split("\\|");
		buffer.clear();
		inChannel.close();
		aFile.close();
		for (String a : c) {
			long count = 0;
			if (wordCount.containsKey(a)) {
				count = wordCount.get(a);
			}

			wordCount.put(a, ++count);

			if (wordCount != null && !wordCount.isEmpty()) {
				Set<Entry<String, Long>> set = wordCount.entrySet();
				List<Entry<String, Long>> list = new ArrayList<Entry<String, Long>>(
						set);
				Collections.sort(list,
						new Comparator<Map.Entry<String, Long>>() {
							public int compare(Map.Entry<String, Long> o1,
									Map.Entry<String, Long> o2) {
								return (o2.getValue()).compareTo(o1.getValue());
							}
						});
				long counter = 0;
				for (Map.Entry<String, Long> entry : list) {
					if (counter < 100000) {
						System.out.println(entry.getKey() + "   "
								+ entry.getValue());
						counter++;
					}
					else{
						break;
					}
				}
			}

		}

	}
}