package adjlab;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Q8 {
	public static void main(String[] args) {
    	Deque<String> linkedList = new ArrayDeque<>();
    	linkedList.add("Black");
    	linkedList.add("Blue");
    	linkedList.add("Green");
    	linkedList.add("Pink");
    	linkedList.add("Red");
    	linkedList.offerLast("pink");
    	System.out.println("\n  Insering at the end:"+linkedList);
    	

}
}
