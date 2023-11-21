package binarysearch;

/**
 *
 * @author Adison
 */
public class Binarysearch {

    public static int binarySearch(int[] array, int target){
        
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midValue = array[mid];

            if (midValue == target) {
                return mid;
            } else if (midValue < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}


