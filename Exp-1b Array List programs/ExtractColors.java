/*4.Write a java program for getting different colors through ArrayList interface and extract the
elements 1st and 2nd from the ArrayList object by using SubList()*/
package adjlab;

import java.util.ArrayList;
import java.util.List;

public class ExtractColors{
	public static void main(String[] args) {
    	List<String> arrayList = new ArrayList<>();
    	arrayList.add("Red");
    	arrayList.add("Green");
        arrayList.add("Blue");
        arrayList.add("Purple");
        arrayList.add("Black");
        List<String> subList = arrayList.subList(0, 2);
        System.out.println("Sublist (0-2): " + subList);

}
}
