package Test2;
import java.util.*;

public class Q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strArr[] = { "P", "Q", "R", "S" };
	      Set s = new HashSet(Arrays.asList(strArr));
	      strArr = new String[] { "R", "S", "T", "U" };
	      s.addAll(Arrays.asList(strArr));
	      System.out.println("Elements = " +s);
	      
	      s.clear();
	      System.out.println("Set after removing all the elements = " +s);
	}

}
