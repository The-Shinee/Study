import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<Integer>();
        li.add(0);
        li.add(1);

        List<Integer> linkedLi = new LinkedList<Integer>();
        linkedLi.add(0);
        linkedLi.add(1);

        Set<Integer> set = new HashSet<Integer>();
        set.add(0);
        set.add(1);

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0, 0);
        map.put(1, 0);
    }
}
