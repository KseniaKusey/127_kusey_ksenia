import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class Counter {

    public static Map<Integer, Integer> count(int[] arr) {
        Arrays.sort(arr);
        Map<Integer, Integer> map = new HashMap<>();
        for (int elem : arr) {
            map.putIfAbsent(elem, 0);
            map.computeIfPresent(elem, (key, oldValue) -> ++oldValue);
        }
        return map;
    }
}

