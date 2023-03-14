import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Greedy {

    public static void main(String[] args) {

        Set<Integer> integers = new HashSet<>(List.of(1, 2, 3, 4, 4, 5, 6, 4, 3, 2, 1));
        Set<Integer> integers2 = new HashSet<>(List.of(10, 20, 3, 4, 4, 5, 6, 40, 33, 22, 11));
        integers.removeAll(integers2);
        System.out.println(integers);
    }
}
