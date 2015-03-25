package string;

import java.util.Scanner;

public class IsPalindrom {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		StringBuilder builder= new StringBuilder(scanner.next());
		StringBuilder rev=new StringBuilder(builder);
		if(builder.toString().equals(rev.reverse().toString())){
			System.out.println(builder+" is Palindrom");
		}
		else
		{
			System.out.println(builder+" is Not a Palindrom");
		}

	}

}
