/*7.Remove the following all elements from the TreeMap then verify that its size is zero and include once again following elements and iterate them and check its size (1,”Banana”), (2,”Orange”), (3,”Guava”), (4,”Pomegranate ”), (5,”Amla”) [ Hint : clear() , size() and put()] 🔗 Output Screenshot*/
package collections;
import java.util.*;

public class TreeMapClearAndAdd {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Map< Integer,String> Map = new TreeMap<>();
			// 1. Basic Operations
			// Adding elements
			Map.put(1,"Apple");
			Map.put(2,"Strawberry");
			Map.put(3,"Pear");
			Map.put(4,"Cucumber");
			Map.put(5,"Grapes");
			Map.clear();
			System.out.println("After removing All elements size : "+Map.size());
			Map.put(1,"Apple");
			Map.put(2,"Strawberry");
			Map.put(3,"Pear");
			Map.put(4,"Cucumber");
			Map.put(5,"Grapes");
			System.out.println("After Adding All elements size : "+Map.size());

		}

	}
