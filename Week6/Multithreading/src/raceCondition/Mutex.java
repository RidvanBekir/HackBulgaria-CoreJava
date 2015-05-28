package raceCondition;

public class Mutex {

    private Object lock = new Object();
    private Thread t;

    public void aquire() {
        if (t != null) {
            try {
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            t = Thread.currentThread();
        }       
    }

    public void release() {
        lock.notifyAll();
        t = null;
    }
}
