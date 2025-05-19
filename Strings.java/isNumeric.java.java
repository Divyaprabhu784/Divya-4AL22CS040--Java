package String_Functions;
import java.util.Scanner;

public class l3Q8 {
	public static boolean isNumeric(String str) {
        if (str.isEmpty()) {
            return false;
        }
        for (int i=0;i<str.length();i++){
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        sc.close();

        if (isNumeric(s)) {
            System.out.println("The string contains only numbers.");
        } else {
            System.out.println("The string contains non-numeric characters.");
        }
    }
}
