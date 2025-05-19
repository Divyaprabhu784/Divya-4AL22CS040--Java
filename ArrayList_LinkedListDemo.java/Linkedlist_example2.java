package adjlab;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Q7 {
	public static void main(String[] args) {
    	List<String> linkedList = new LinkedList<>();
    	linkedList.add("Black");
    	linkedList.add("Blue");
    	linkedList.add("Green");
    	linkedList.add("Pink");
    	linkedList.add("Red");
	 System.out.println("\nIterating using Iterator:");
     Iterator<String> iterator = ((LinkedList<String>) linkedList).descendingIterator();
     while (iterator.hasNext()) {
         System.out.println(iterator.next());
     }
}
}
