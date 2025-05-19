package adjlab;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Q10 {
	public static void main(String[] args) {
    	List<String> linkedList = new LinkedList<>();
    	linkedList.add("Black");
    	linkedList.add("Blue");
    	linkedList.add("Green");
    	linkedList.add("Pink");
    	linkedList.add("Red");
    	Collections.swap(linkedList, 0, 2);
    	System.out.println("After Swapping:" +linkedList);

}
}
