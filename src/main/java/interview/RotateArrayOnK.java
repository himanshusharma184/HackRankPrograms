package interview;

import java.util.*;

public class RotateArrayOnK {
	public static void main(String []args){
	     Scanner sc= new Scanner(System.in);
	     int k= sc.nextInt();
	     int a =sc.nextInt();
	     int []s= new int [a];
	     for(int i=0; i<a;i++){
	         s[i]= sc.nextInt();
	     }
	     
	     for(int i=0;i<k;i++){
	         for(int j=s.length-1;j>0;j--){
	             int temp=s[j];
	             s[j]=s[j-1];
	             s[j-1]=temp;
	         }
	     }
	     
	     System.out.println(Arrays.toString(s));
	 }
}
