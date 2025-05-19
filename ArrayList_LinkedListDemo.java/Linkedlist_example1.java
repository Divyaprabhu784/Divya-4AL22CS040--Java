package adjlab;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Q6 {
	public static void main(String[] args) {
    	List<String> linkedList = new LinkedList<>();
    	linkedList.add("Red");
    	linkedList.add("Green");
    	linkedList.add("Blue");
    	linkedList.add("Purple");
    	linkedList.add("Black");
	 System.out.println("\nIterating using Iterator:");
     Iterator<String> iterator = linkedList.listIterator(2);
     while (iterator.hasNext()) {
         System.out.println(iterator.next());
     }

}
}
