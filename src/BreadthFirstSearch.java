import java.util.*;

public class BreadthFirstSearch {

    public static void main(String[] args) {
        var friends = new Hashtable<String, List<String>>();
        var alice = new ArrayList<>(List.of("ed", "motta"));
        var bob = new ArrayList<>(List.of("selam", "becky", "jonny"));
        var claire = new ArrayList<>(List.of("adit", "becky", "jonny"));
        friends.put("alice", alice);
        friends.put("bob", bob);
        friends.put("claire", claire);
        System.out.println(breadthFirstSearch(friends));
    }

    // 1- keep a queue containing the people to check
    // 2- Pop a person off the queue
    // 3- Check if this person is a mango seller
    // 4a- Yes: You are done!
    // 4b- Add all their neighbors to the queue
    // 5- Loop
    // 6- If the queue is empty, there are no mango sellers in your network
    static boolean breadthFirstSearch(Hashtable<String, List<String>> friends) {

        var searchQueue = new PriorityQueue<String>();
        searchQueue.addAll(friends.keySet());
        var searched = new LinkedList<String>();

        while (!searchQueue.isEmpty()) {
            var person = searchQueue.poll();
            if (searched.stream().noneMatch(search -> search.equals(person))) {
                if (personIsSeller(person)) {

                    System.out.println(person + " is a mango seller.");
                    return true;
                }
            } else {
                if (friends.get(person) != null) {

                    searchQueue.addAll(friends.get(person));
                    searched.add(person);
                }
            }
        }
        return false;
    }

    private static boolean personIsSeller(String person) {
        return "adit".equals(person);
    }
}
