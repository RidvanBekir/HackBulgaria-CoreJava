package ToDoList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class ToDoList {
    private int time;
    private PriorityQueue<Task> taskQueue;
    Comparator<Task> comparator = new PriorityComparator();

    public ToDoList(int time) {
        this.time = time;
        taskQueue = new PriorityQueue<Task>(4, comparator);
    }

    public void add(Task t) {
        taskQueue.offer(t);
        time -= t.getTime();
    }

    public void markFinished(Task t) {
        t.setFinished(true);
    }

    public void markCancelled(Task t) {
        t.setFinished(false);
    }

    public Task getTop() {
        Task topTask = null;
        Iterator<Task> iterate = taskQueue.iterator();
        while (iterate.hasNext()) {
            topTask = iterate.next();
            break;
        }
        return topTask;
    }

    public boolean canFinish() {
        if (time < 0) {
            return false;
        }
        return true;

    }

    public int getRemainigTime() {
        return time;
    }

    public int getTimeNeeded() {
        int timeNeeded = 0;
        Iterator<Task> iterate = taskQueue.iterator();
        while (iterate.hasNext()) {
            timeNeeded += iterate.next().getTime();
        }
        return timeNeeded;
    }

    @Override
    public String toString() {
        String result = "";
        Iterator<Task> iterate = taskQueue.iterator();
        Task temp = null;
        while (iterate.hasNext()) {
            temp = iterate.next();
            result += temp.getDescription() + "-->Time required: " + temp.getTime() + ";  ";
        }
        return result;
    }
}
