package String_Functions;
import java.util.Scanner;

public class l3Q1 {
		public static boolean isNullOrEmpty(String s){
				if(s==null||s.isEmpty()) {
					return true;
				}
				for(char ch:s.toCharArray()) {
		            if (ch != ' ') {
		                return false;
		            }
				}
			return true;
		}

		public static void main(String[] args) {
			String str="  ";
			isNullOrEmpty(str);
			if(isNullOrEmpty(str)) {
				System.out.println("space or null");
			}
			else {
				System.out.println("not");
			}

		}

	}
