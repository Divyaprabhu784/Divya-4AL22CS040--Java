package adjlab;

import java.util.ArrayList;
import java.util.List;

public class RemoveColors {
	public static void main(String[] args) {
    	List<String> arrayList = new ArrayList<>();
    	arrayList.add("Red");
    	arrayList.add("Green");
        arrayList.add("Blue");
        arrayList.add("Purple");
        arrayList.add("black");
        System.out.println("After adding elements: " + arrayList);
        arrayList.remove("Blue"); 
        System.out.println("After removing elements: " + arrayList);
        arrayList.add(2,"Blue");
        arrayList.remove(2);
        System.out.println("After removing elements: " + arrayList);
 

}
}
