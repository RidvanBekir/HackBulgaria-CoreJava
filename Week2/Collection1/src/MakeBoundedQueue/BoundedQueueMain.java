package MakeBoundedQueue;

public class BoundedQueueMain {

    public static void main(String[] args) {

        BoundedQueue<Integer> boundedQueue = new BoundedQueue<>(3);
        boundedQueue.offer(1);
        boundedQueue.offer(2);
        boundedQueue.offer(3);
        boundedQueue.offer(4);
        boundedQueue.offer(5);
        boundedQueue.offer(6);
        System.out.println(boundedQueue.toString());
    }
}
