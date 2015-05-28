package SimpleBlockingQueue;

import java.util.Deque;

class Caller implements Runnable {
    private Deque<Object> queue;
    private String name;

    public Caller(String name, Deque<Object> queue) {
        this.name = name;
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Polled: " + polled().toString());
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    private Object polled() throws InterruptedException {
        synchronized (queue) {
            while (queue.isEmpty()) {
                System.out.println("Queue is empty. " + this.name.toString() + " is waiting , size: " + queue.size());
                queue.wait();
            }
        queue.notifyAll();
        return queue.removeFirst();
        }
    }
}
