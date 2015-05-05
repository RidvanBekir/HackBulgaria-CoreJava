package ReverseGenericCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ReverseCollection {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Iterator<Integer> iterator = reverse(list).iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static Collection<Integer> reverse(Collection<Integer> collection) {

        int[] array = new int[collection.size()];
        int i = 0;
        Iterator<Integer> iterator = collection.iterator();
        while (iterator.hasNext()) {
            array[i] = iterator.next();
            i++;
        }
        collection.clear();
        for (int k = array.length - 1; k >= 0; k--) {
            collection.add(array[k]);
        }
        return collection;
    }
}
