/*Q3. Write a Java Program for Reversing the characters in a string using user defined function
reverseString().*/
package String_Functions;
import java.util.Scanner;

public class StringReverser {
	public static String reverseString(String str) {
        String reversed = "";
        for (int i =str.length()-1;i>=0;i--){
            reversed+=str.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        String result=reverseString(s);
        System.out.println(result);
    }
}
