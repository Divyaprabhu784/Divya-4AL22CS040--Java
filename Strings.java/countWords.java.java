package String_Functions;
import java.util.*;

public class l3q10 {
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
