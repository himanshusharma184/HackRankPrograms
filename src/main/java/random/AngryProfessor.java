package random;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AngryProfessor {

	public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	int a= scanner.nextInt();
	for(int i=0;i<a;i++){
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		List<Integer>list= new ArrayList<Integer>();
		for(int j=0;j<b;j++){
			list.add(scanner.nextInt());
		}
		Collections.sort(list);
		if(list.get(c-1)>0){
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}

	}

}
