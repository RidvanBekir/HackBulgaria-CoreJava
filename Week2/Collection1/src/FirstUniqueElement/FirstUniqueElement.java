package FirstUniqueElement;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FirstUniqueElement {

    public static void main(String[] args) {
        Collection<Integer> ints = Arrays.asList(1, 1, 2, 3, 4, 5, 5, 6, 4, 3, 1);
        firstUniqueElement(ints); // 2

    }

    public static void firstUniqueElement(Collection<Integer> ints) {

        LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<Integer, Integer>();
        int i = 0;
        Iterator<Integer> iterator = ints.iterator();
        while (iterator.hasNext()) {
            hm.put(i, iterator.next());
            i++;
        }

        for (Integer s : new ConcurrentHashMap<>(hm).keySet()) {
            Integer value = hm.get(s);
            for (Map.Entry<Integer, Integer> ss : new ConcurrentHashMap<>(hm).entrySet()) {
                if (s != ss.getKey() && value == ss.getValue()) {
                    hm.remove(s);
                }
            }
        }
        Object myKey = hm.keySet().toArray()[0];
        Object myValue = hm.get(myKey);
        System.out.println("The first unique element is: " + myValue);
    }
}
