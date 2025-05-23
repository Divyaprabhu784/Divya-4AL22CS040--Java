/*Q4. Write a Java Program for Checking if a string reads the same backward as forward (ignoring case
and punctuation) using user defined function isPalindrome():*/
package String_Functions;
import java.util.Scanner;

public class PalindromeChecker {
	public static boolean isPalindrome(String s){
		int left=0;
		int right=s.length()-1;
		while(left<right) {
			if(s.charAt(left)==s.charAt(right)) {
				return true;
			}
			left++;
			right--;
		}
	return false;
}

public static void main(String[] args) {
	String str="Gadag";
	isPalindrome(str);
	if(isPalindrome(str)) {
		System.out.println("yes");
	}
	else {
		System.out.println("not");
	}

}

}
