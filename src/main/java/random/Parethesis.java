package random;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Parethesis {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int a= scanner.nextInt();
        System.out.println(prent(a));
    }

    public static List<String> prent(int n) {
        List<String> l = new ArrayList<String>();
        if(n==1) {
            l.add("()");
            return l;
        }
        for(String st : prent(n-1)) {
            l.add(st+"()");
            l.add("("+st+")");
            if(!(st+"()").equals("()"+st)) {
                l.add("()"+st);
            }
        }
        return l;
    }

}