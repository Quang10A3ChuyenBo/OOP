import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Arrays;
public class Appearances {
    public static <T> int sameCount(Collection<T> a, Collection<T> b) {
        Map<T, Integer> countMapA = getFrequencyMap(a);
        Map<T, Integer> countMapB = getFrequencyMap(b);

        int sameCount = 0;

        for (Map.Entry<T, Integer> entry : countMapA.entrySet()) {
            T key = entry.getKey();
            int countA = entry.getValue();
            int countB = countMapB.getOrDefault(key, 0);
            if (countA == countB) {
                sameCount++;
            }
        }

        return sameCount;
    }

    private static <T> Map<T, Integer> getFrequencyMap(Collection<T> collection) {
        Map<T, Integer> frequencyMap = new HashMap<>();
        for (T item : collection) {
            frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
        }
        return frequencyMap;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Collection<String> collectionA = Arrays.asList(scanner.nextLine().split("\\s+"));
        Collection<String> collectionB = Arrays.asList(scanner.nextLine().split("\\s+"));
        int result = sameCount(collectionA, collectionB);
        System.out.println("Number of elements with the same count: " + result);
    }
}
