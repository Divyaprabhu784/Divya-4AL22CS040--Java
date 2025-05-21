package adjlab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sortcolors {
	public static void main(String[] args) {
    	List<String> arrayList = new ArrayList<>();
    	arrayList.add("Red");
    	arrayList.add("Green");
        arrayList.add("Blue");
        arrayList.add("Purple");
        arrayList.add("Black");
	 Collections.sort(arrayList);
     System.out.println("After sorting: " + arrayList);

}
}
