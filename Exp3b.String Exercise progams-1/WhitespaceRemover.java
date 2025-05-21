/*Q5. Write a Java Program for Eliminating all whitespace characters from a string using user defined
function removeWhitespace()*/
package String_Functions;
import java.util.Scanner;

public class WhitespaceRemover {
	 public static String removeWhitespace(String str) {
	        String ans= "";
	        for(int i=0;i<str.length();i++) {
	        	if(str.charAt(i)!=' ') {
	        		ans += str.charAt(i);
	        	}
	        }
	        return ans;
	        
	    }

	    public static void main(String[] args) {
	        Scanner sc =new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String s = sc.nextLine();

	        String result=removeWhitespace(s);
	        System.out.println(result);
	    }
	}
