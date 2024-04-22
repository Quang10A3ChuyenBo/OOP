
import java.util.*;

public class Taboo<T> {
    private Map<T, Set<T>> ruleMap;

    public Taboo(List<T> rules) {
        ruleMap = new HashMap<>();
        T prev = null;
        for (T current : rules) {
            if (current != null) {
                if (prev != null) {
                    ruleMap.computeIfAbsent(prev, k -> new HashSet<>()).add(current);
                }
            }
            prev = current;
        }
    }

    public Set<T> noFollow(T elem) {
        return ruleMap.getOrDefault(elem, Collections.emptySet());
    }

    public void reduce(List<T> list) {
        Iterator<T> iterator = list.iterator();
        T prev = null;
        while (iterator.hasNext()) {
            T current = iterator.next();
            if (prev != null && ruleMap.containsKey(prev) && ruleMap.get(prev).contains(current)) {
                iterator.remove();
            } else {
                prev = current;
            }
        }
    }
}

