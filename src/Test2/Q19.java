package Test2;
import java.util.*;

public class Q19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> t_set1 = new TreeSet<String>();
	     
        t_set1.add("Red");
        t_set1.add("Green");
        t_set1.add("Black");
        t_set1.add("White");
        System.out.println("First Tree set: "+t_set1);



        TreeSet<String> t_set2 = new TreeSet<String>();
        t_set2.add("Red");
        t_set2.add("Pink");
        t_set2.add("Black");
        t_set2.add("Orange");
        System.out.println("Second Tree set: "+t_set2);
        
        TreeSet<String> result_set = new TreeSet<String>();
       for (String element : t_set1){
           System.out.println(t_set2.contains(element) ? "Yes" : "No");
        }      

	}

}
