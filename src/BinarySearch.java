import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(binarySearch(array, 3));
    }

    private static int binarySearch(int[] array, int pickedNumber) {

        int low = 0, high = array.length - 1;

        while (low <= high) {
            int mid = (high + low)  / 2;
            int guess = array[mid];
            if (guess == pickedNumber) {
                return mid;
            } else if (guess < pickedNumber) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
