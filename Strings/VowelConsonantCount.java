import java.util.*;
public class VowelConsonantCount {

    public static boolean isVowel(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }

    public static int[] countVowelsConsonants(String text) {
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                if (isVowel(ch)) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int[] result = countVowelsConsonants(input);
        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);
    }
}
