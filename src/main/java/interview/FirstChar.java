package interview;

import java.util.*;

public class FirstChar {

	public static void main(String []args){
	     
	     Scanner sc= new Scanner(System.in);
	     
	     String s= sc.next();
	     Set<Character>list= new HashSet<Character>();
	     Stack<Character>st= new Stack<Character>();
	     for(int i=s.length()-1;i>=0;--i){
	         if(list.contains(s.charAt(i))){
	             if(!st.isEmpty()){
	                 if(st.peek()==s.charAt(i)){
	                     st.pop();
	                 }
	             }
	         }
	         else
	         {
	             st.push(s.charAt(i));
	             list.add(s.charAt(i));
	         }
	     }
	     if(st.isEmpty()){
	         System.out.println("not found");
	     }
	     else
	     {
	         System.out.println(st.pop());
	     }
	 }
	
	
}
