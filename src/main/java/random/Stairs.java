package random;
import java.util.*;
public class Stairs {

    
    public List<String> getStairs(int i){

        List<String>list= new ArrayList<String>();
        if(i==2){
            list.add("1,1");
            list.add("2");
            return list;
        }
        for(String s:getStairs(i-1)){
            list.add(s+"1,1");
            list.add(s+"2");
            if(!(s+"1,1").equals("1,1"+s)){
                list.add("1,1"+s);
            }
            if(!(s+"2").equals("2+s")){
                list.add("2"+s);
            }
        }
		return list;
    }
    
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        
        int i= sc.nextInt();
  
        Stairs m= new Stairs();
       System.out.println(Arrays.toString(( m.getStairs(i).toArray())));
    }


}
