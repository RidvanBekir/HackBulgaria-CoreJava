package raceCondition;

class Threads implements Runnable {
    MyInteger count;
    String threadName;
    Mutex mutex = new Mutex();
    
    Threads(String name, MyInteger count) {
        this.threadName = name;
        this.count = count;
    }

    @Override
    public void run() {

        mutex.aquire();
        for (int i = 0; i < 2_000_000; i++) {
            increment();
        }
        mutex.release();
    }

    public void increment() {
        count.increment();
        System.out.println(threadName + "  =  " + count.getInteger());
    }

    public void decrement() {
        count.decrement();
        System.out.println(threadName + "  =  " + count.getInteger());
    }
}
