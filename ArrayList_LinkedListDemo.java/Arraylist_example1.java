package adjlab;

import java.util.ArrayList;
import java.util.List;

public class Q1 {
	    public static void main(String[] args) {
	    	List<String> arrayList = new ArrayList<>();
	    	arrayList.add("Red");
	    	arrayList.add("Green");
	        arrayList.add("Yellow");
	        arrayList.add("Purple");
	        arrayList.add("black");
	        System.out.println("After adding elements: " + arrayList);
	        boolean containsRed = arrayList.contains("Red");
	        System.out.println("Contains Red? " +containsRed );
	    }
}
