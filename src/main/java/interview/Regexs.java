package interview;

import java.util.Scanner;

public class Regexs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String reg = sc.nextLine();
		String b = new String(a);
		int alength=0;
		for (int i = 0; i < reg.length(); i++, alength++) {
			if (!Character.isAlphabetic(reg.charAt(i))) {
				a = getPart(reg.substring(i - 1), a.substring(alength));
				if (a == null) {
					System.out.println("not found");
					break;
					
				} else if (a.isEmpty() && i==reg.length()-1) {
					System.out.println("found");
					break;
				}
				alength=-1;
				i++;
			} else {
				if(a.length()==0 && i==reg.length()-1){
					System.out.println("not found");
					break;
				}
				if (reg.charAt(i) != a.charAt(alength)) {
					System.out.println("not found");
					break;
				}
			}
		}
	}

	public static String getPart(String reg, String a) {
		char ch = reg.charAt(1);
		if (reg.charAt(1) == '+') {
			if (reg.charAt(0) == a.charAt(0))
				a=a.replaceFirst(String.valueOf(reg.charAt(0)), "");
			else {
				return null;
			}
		}
		int index = -1;
		int size = 3;
		if (reg.charAt(2) == reg.charAt(0)) {

			for (int j = 0; j < a.length() - 1; j++) {
				if (reg.charAt(2) != a.charAt(j)) {
					index = j;
					break;
				}
			}
		} else {

			for (int j = 0; j < a.length() - 1; j++) {
				if (reg.charAt(0) != a.charAt(j)) {
					index = j;
					break;
				}
			}
			for (int p = index; p < a.length() - 1; p++) {
				if (reg.charAt(2) != a.charAt(p)) {
					index = p;
					break;
				}
			}
		}
		if (index < 1) {
			return null;
		} else if (index < a.length() - 1) {

			return a.substring(index);
		} else {
			return null;
		}
	}

}
