import java.util.Scanner;

public class UppercaseCompare {

    public static String customToUpperCase(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }
            result += ch; 
        }
        return result;
    }

    public static boolean areStringsEqual(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String input = sc.nextLine();

        String builtInUpper = input.toUpperCase();

        String customUpper = customToUpperCase(input);

        boolean isSame = areStringsEqual(builtInUpper, customUpper);
        System.out.println("Built-in toUpperCase: " + builtInUpper);
        System.out.println("Custom toUpperCase  : " + customUpper);
        System.out.println("Are both equal?      : " + isSame);
    }
}
