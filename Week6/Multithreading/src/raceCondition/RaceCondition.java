package raceCondition;


public class RaceCondition {

    public static void main(String[] args) {

        MyInteger count = new MyInteger(0);
        Thread t1 = new Thread(new Threads("T1", count));
        Thread t2 = new Thread(new Threads("T2", count));

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Result : " + count.getInteger());
    }
}
