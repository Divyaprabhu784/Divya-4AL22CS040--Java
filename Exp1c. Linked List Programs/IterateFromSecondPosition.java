/*1. Write a Java program to iterate through all elements in a linked list starting at the
specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))*/
package adjlab;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IterateFromSecondPosition {
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
