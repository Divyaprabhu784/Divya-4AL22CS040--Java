/*Write a Java program to display elements and their positions in a linked list ( using
l_listobj.get(p) )*/
package adjlab;

import java.util.LinkedList;
import java.util.List;

public class DisplayElementsWithPositions {
	public static void main(String[] args) {
    	List<String> linkedList = new LinkedList<>();
    	linkedList.add("Black");
    	linkedList.add("Blue");
    	linkedList.add("Green");
    	linkedList.add("Pink");
    	linkedList.add("Red");
    	int n=linkedList.size();
    	for(int i=0;i<n;i++) {
    		System.out.println(" "+linkedList.get(i)+ " and position is "+i);
    	}

}
}
