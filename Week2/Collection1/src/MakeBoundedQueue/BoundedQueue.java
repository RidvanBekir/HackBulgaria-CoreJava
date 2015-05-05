package MakeBoundedQueue;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class BoundedQueue<T> extends BoundedQueueImpl<T> {

    private int x;
    private Deque<T> queue = new LinkedList<T>();

    public BoundedQueue(int x) {
        if (x < 0)
            return;
        this.x = x;
    }

    @Override
    public void clear() {
        queue.clear();
    }

    @Override
    public boolean remove(Object o) {
        queue.remove(o);
        return false;
    }
    
    @Override
    public boolean offer(T e) {

        if (x > 0) {
            queue.offer(e);
            x--;
        } else {
            queue.removeFirst();
            queue.offerLast(e);
        }
        return false;
    }

    @Override
    public T remove() {
        queue.remove();
        return null;
    }

    @Override
    public String toString() {
        String result = "";
        Iterator<T> iterator = queue.iterator();
        while (iterator.hasNext()) {
            result += iterator.next() + "   ";
        }
        return result;
    }

}
