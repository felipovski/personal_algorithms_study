public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 6, 1, 3};
        for (int item : insertionSort(arr)) {
            System.out.println(item);
        }
        
    }

    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                int temp = arr[j];
                arr[j] = key;
                arr[j + 1] = temp;
                j--;
            }
        }
        return arr;
    }
}
