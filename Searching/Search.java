package searching_package;

import java.util.*;

public class Search {

    //Method to find first missing positive integer using Linear Search
    public static int findFirstMissingPositive(int[] arr) {
        int n = arr.length;

        //Place elements at their correct positions if possible
        for (int i = 0; i < n; i++) {
            while (arr[i] > 0 && arr[i] <= n && arr[arr[i] - 1] != arr[i]) {
            	
                // Swap arr[i] with arr[arr[i] - 1]
                int temp = arr[i];
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp;
            }
        }

        //Find the first place where index doesn't match the value
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }

    //Method to perform Binary Search
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; 
    }

    //Main method
    public static void main(String[] args) {
        int[] input = {3, 4, -1, 1};
        int target = 4;

        //Linear Search to find first missing positive number
        int missing = findFirstMissingPositive(Arrays.copyOf(input, input.length));
        System.out.println("First Missing Positive: " + missing);

        //Sort array for Binary Search
        Arrays.sort(input);
        System.out.println("Sorted Array: " + Arrays.toString(input));

        //Binary Search to find target
        int index = binarySearch(input, target);
        if (index == -1) {
            System.out.println("Target " + target + " not found");
        } else {
            System.out.println("Target " + target + " found at index: " + index);
        }
    }
}
