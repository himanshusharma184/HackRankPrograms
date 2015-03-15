package sort;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class insertIntoSorted {
    
    

    public static void insertIntoSorted(int[] ar) {
		for (int i = ar.length - 1; i > 0; i--) {
			if (ar[i] < ar[i - 1]) {
				
				int c = ar[i];
				ar[i] = ar[i - 1];
				
				print(ar);
				System.out.println("\n");
				ar[i - 1] = c;

				
			} else {
				print(ar);
				System.out.println("\n");
			}
		}
		
    }
    	private static void print(int[] ar) {
		for(int i:ar){
			System.out.print(i+" ");
		}
		
	}
    
/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
    
}

