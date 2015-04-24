package interview;

import java.util.Scanner;

public class Space{
	 
	 public static void main(String []args){
	     Scanner sc= new Scanner(System.in);
	     String s= sc.nextLine();
	     
	     StringBuffer sb= new StringBuffer();
	     String []ssc= s.split(" ");
	    
	     for(int i=0;i<ssc.length-1;i++){
	         sb.append(ssc[i]).append("%20");
	         
	     }
	     sb.append(ssc[ssc.length-1]);
	     System.out.println(sb.toString());
	 }   
	}
