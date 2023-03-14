import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SelectionSort {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(5, 57, 59, 11, 203));
        selectionSort(arr).forEach(System.out::println);
    }

    static List<Integer> selectionSort(List<Integer> arr) {
        List<Integer> sortedArr = new ArrayList<>();

        while (arr.size() > 0) {
            int smallest = findSmallest(arr);
            sortedArr.add(arr.remove(smallest));
        }
        return sortedArr;
    }

    static int findSmallest(List<Integer> arr) {
        int smallest = arr.get(0);
        int smallestIndex = 0;
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < smallest) {
                smallest = arr.get(i);
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
}
