package RotateElementsOfCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class RotateCollection {

    public static void main(String[] args) {

        Collection<Object> collection = Arrays.asList("one", "two", "three", "four", "five", "six", "seven");
        int rotateStep = 3;
        rotate(collection, rotateStep);
    }

    public static <T> void rotate(Collection<T> collection, int rotateStep) {
        Deque<T> queue = new LinkedList<T>();
        Iterator<T> iterator = collection.iterator();
        while (iterator.hasNext()) {
            queue.offer((T) iterator.next());
        }
        if (rotateStep > 0) {
            for (int k = 0; k < rotateStep; k++) {
                T temp = queue.getLast();
                queue.removeLast();
                queue.offerFirst(temp);
            }
        }
        if (rotateStep < 0) {
            for (int l = 0; l < Math.abs(rotateStep); l++) {
                T temp = queue.getFirst();
                queue.removeFirst();
                queue.offerLast(temp);
            }
        }
        String result = "";
        Iterator<T> iterate = queue.iterator();
        while (iterate.hasNext()) {
            result += iterate.next() + "   ";
        }
        System.out.println(result);
    }
}
