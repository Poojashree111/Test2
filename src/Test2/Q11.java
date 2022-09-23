package Test2;
import java.util.*;
public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        LinkedList<String> l = new LinkedList<String>();
       
        l.add("ram");
        l.add("shyam");
        l.add("gyan");
        l.add("dhyan");
        l.add("vyan");
       
        System.out.println("The elements of LinkedList are: "+l);
      
       LinkedList<String> clone = (LinkedList<String>)l.clone();
       System.out.println("Cloned LinkedList: " + clone);

	}

}
