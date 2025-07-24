package searching_package;

public class PeakElement {

    //Method to find peak element
    public static int findPeak(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            int leftNeighbor = (mid > 0) ? arr[mid - 1] : Integer.MIN_VALUE;
            int rightNeighbor = (mid < n - 1) ? arr[mid + 1] : Integer.MIN_VALUE;

            //Check if mid is a peak
            if (arr[mid] > leftNeighbor && arr[mid] > rightNeighbor) {
                return arr[mid]; 
            }

            if (arr[mid] < leftNeighbor) {
                right = mid - 1; 
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }

    //Main Method
    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1, 0};
        int peak = findPeak(arr);
        System.out.println("Peak element is: " + peak);
    }
}























