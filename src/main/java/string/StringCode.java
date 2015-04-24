package string;

import java.util.Arrays;
import java.util.Scanner;

public class StringCode {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String st = scanner.next();
		char[] str = st.toCharArray();
		if (str == null)
			return;
		int len = str.length;
		if (len < 2)
			return;
		int tail = 1;

		for (int i = 1; i < len; ++i) {
			int j;
			for (j = 0; j < tail; ++j) {
				if (str[i] == str[j])
					break;
			}
			if (j == tail) {
				str[tail] = str[i];
				++tail;
			}

		}
		str[tail]=0;
		
		System.out.println(Arrays.toString(str));
	}
}
