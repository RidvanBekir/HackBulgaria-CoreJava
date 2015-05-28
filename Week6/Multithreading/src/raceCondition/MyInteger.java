package raceCondition;

public class MyInteger {

    private int count;

    public MyInteger(int number) {
        this.count = number;
    }

    public void increment() {
        this.count = count + 1;
    }

    public void decrement() {
        this.count = count - 1;
    }
    
    public int getInteger(){
        return count;
    }
}
