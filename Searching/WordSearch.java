package searching_package;

public class WordSearch {
    public static void main(String[] args) {
        String[] sentences = {
            "My",
            "Name is",
            "Sajal Singh",
            "Hello guys"
        };

        //Word to search
        String word = "guys";
        boolean found = false;

        //Loop through sentences to search for the word
        for (String sentence : sentences) {
            if (sentence.toLowerCase().contains(word.toLowerCase())) {
                System.out.println("Found: " + sentence);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Not Found");
        }
    }
}

