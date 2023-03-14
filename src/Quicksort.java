import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Quicksort {

    public static void main(String[] args) {
        var startTimeMillis = System.currentTimeMillis();
        quicksort(List.of(2, 1, 3, 5, 4));
        System.out.println(System.currentTimeMillis() - startTimeMillis);

        startTimeMillis = System.currentTimeMillis();
        Arrays.sort(new int[]{2, 1, 3, 5, 4});
        System.out.println(System.currentTimeMillis() - startTimeMillis);

    }

    static List<Integer> quicksort(List<Integer> arr) {
        if (arr.size() < 2) {
            return arr;
        }
        int pivotIndex = arr.size() / 2;
        int pivot = arr.get(pivotIndex);
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            if (pivotIndex == i) continue;
            if (arr.get(i) <= pivot) {
                left.add(arr.get(i));
            } else {
                right.add(arr.get(i));
            }
        }

        return Stream.of(quicksort(left), List.of(pivot), quicksort(right)).flatMap(Collection::stream).toList();
    }
}
