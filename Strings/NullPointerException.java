public class NullPointerException {

  
    public static void generateNullPointerException() {
        String text = null; 
        System.out.println("Length of text: " + text.length());
    }

    public static void handleNullPointerException() {
        String text = null;
        try {
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        generateNullPointerException();
        handleNullPointerException();
    }
}

