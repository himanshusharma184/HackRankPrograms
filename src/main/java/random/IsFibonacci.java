package random;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class IsFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		int b=scanner.nextInt();
		for (int a = 0; a < b; a++) {
			list.add(scanner.nextInt());
		}
		Collections.sort(list);
		int last2 = 0;
		int last1 = 1;
		int p=1;
		List<Integer>set= new ArrayList<Integer>();
		set.add(p);
		set.add(last1);
		set.add(last2);
		while(p<=list.get(list.size()-1)){
			int a=p;
			p=p+last1;
			last2=last1;
			last1=a;
			set.add(a);
		}
		set.add(p+last1);
		set.add(p);
		for(Integer integer:list){
			if(set.contains(integer)){
				System.out.println("IsFibo");
			}
			else{
				System.out.println("IsNotFibo");
			}
		}

	}

}
