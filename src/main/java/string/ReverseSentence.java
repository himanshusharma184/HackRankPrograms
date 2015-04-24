package string;

import java.util.Scanner;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();

		StringBuffer b = new StringBuffer(s);
		b.reverse();
		String[] f = b.toString().split(" ");
		StringBuffer finall = new StringBuffer();
		for (String i : f) {
			StringBuffer buffer = new StringBuffer(i);
			finall.append(buffer.reverse()).append(" ");
		}
		System.out.println(finall);
	}

}
