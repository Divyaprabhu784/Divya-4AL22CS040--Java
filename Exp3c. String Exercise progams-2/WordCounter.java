/*Q10. Write a Java Program for Counting the number of words in a string using user defined function
countWords()*/
package String_Functions;
import java.util.*;

public class WordCounter {
	public static int countWords(String str) {
        int count=0;

        for (int i=0;i<str.length();i++) {
            if (str.charAt(i)!=' '&&(i==0||str.charAt(i - 1)==' ')) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        sc.close();

        int result = countWords(s);
        System.out.println("Word count: " + result);
    }
}
