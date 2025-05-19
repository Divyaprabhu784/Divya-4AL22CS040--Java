package adjlab;

import java.util.ArrayList;
import java.util.List;

public class Q5 {
	public static void main(String[] args) {
    	List<String> arrayList = new ArrayList<>();
    	arrayList.add("Red");
    	arrayList.add("Green");
        arrayList.add("Blue");
        arrayList.add("Purple");
        arrayList.add("Black");
        arrayList.remove(4);
        System.out.println("After removing elements: " + arrayList);

}
}
