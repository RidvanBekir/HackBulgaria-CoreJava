package SimpleBlockingQueue;

import java.util.Deque;
import java.util.LinkedList;

public class BlockingQueue {

    public static <E> void main(String[] args) {
        Deque<Object> queue = new LinkedList<Object>();
        int size = 6;
        Thread adder = new Thread(new Adder("Adder", queue , size));
        Thread caller = new Thread(new Caller("Caller", queue));
        adder.start();
        caller.start();
    }
}
