/*5. Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using
Collections.swap(l_list, 0, 2))*/
package adjlab;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SwapFirstAndThirdElements {
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