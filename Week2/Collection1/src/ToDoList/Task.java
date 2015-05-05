package ToDoList;

import java.util.Random;

public class Task {

    private int priority;
    private int time;
    private boolean isFinished = false;
    private String description = "Task";
    Random random = new Random();

    public Task() {
        this.priority = random.nextInt(10) + 1;
        this.time = random.nextInt(5) + 1;
    }

    public Task(int priority) {
        this.priority = priority;
        this.time = random.nextInt(5) + 1;
    }

    public Task(int priority, int time) {
        this.priority = priority;
        this.time = time;
    }

    public int getPriority() {
        return priority;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean isFinished) {
        this.isFinished = isFinished;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
