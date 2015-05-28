package SimpleBlockingQueue;

import java.util.Deque;

class Adder implements Runnable {

    private Deque<Object> queue;
    private String name;
    private int size;

    public Adder(String name, Deque<Object> queue, int size) {
        this.name = name;
        this.size = size;
        this.queue = queue;
    }

    @Override
    public void run() {
        int i = 0;
        while(true) {
            try {
                add(++i);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void add(int i) throws InterruptedException {
        
        synchronized (queue) {
            while (queue.size() == size) {
                System.out.println("Queue is full " + this.name.toString() + " is waiting , size: " + queue.size());
                queue.wait();
            }

            Object obj = "Object " + i;
            queue.add(obj);
            System.out.println(this.name.toString() + " added " + obj.toString());
            queue.notifyAll();
        }
    }
}
