/*1. Write a java program for getting different colors through ArrayList interface and search whether
the color "Red" is available or not*/

package adjlab;
import java.util.ArrayList;
import java.util.List;

public class Checkcolour {
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
