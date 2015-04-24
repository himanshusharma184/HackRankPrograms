package interview;

import java.util.*;

public class EvalPolishNotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String k = sc.nextLine();

		Stack<String> st = new Stack<String>();
		String operator = "+-*/";
		String[] c = k.split(" ");
		for (String b : c) {
			if (!operator.contains(b)) {
				st.push(b);
			} else {
				int index = operator.indexOf(b);
				switch (index) {
				case 0: {
					int a = Integer.valueOf(st.pop());
					int d = Integer.valueOf(st.pop());
					st.push(String.valueOf(a + d));
					break;
				}
				case 1: {
					int a = Integer.valueOf(st.pop());
					int d = Integer.valueOf(st.pop());
					st.push(String.valueOf(d - a));
					break;
				}
				case 2: {
					int a = Integer.valueOf(st.pop());
					int d = Integer.valueOf(st.pop());
					st.push(String.valueOf(a * d));
					break;
				}
				case 3: {
					int a = Integer.valueOf(st.pop());
					int d = Integer.valueOf(st.pop());
					st.push(String.valueOf(d / a));
					break;
				}
				}
			}
		}
		System.out.println(st.pop());
	}

}