package searching_package;

public class SearchFirstNegativeNumber {
    public static void main(String[] args) {
        int[] arr = {3, 5, -2, 8, -1};
        int index = findFirstNegative(arr);
        if (index != -1) {
            System.out.println("First negative number found at index: " + index);
        } else {
            System.out.println("No negative number found");
        }
    }

    //Method to perform linear search for the first negative number
    public static int findFirstNegative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i;
            }
        }
        return -1;
    }
}

