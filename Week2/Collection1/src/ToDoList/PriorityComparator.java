package ToDoList;
import java.util.Comparator;


public class PriorityComparator implements Comparator<Task>{

    @Override
    public int compare(Task arg0, Task arg1) {
        // TODO Auto-generated method stub
        if (arg0.getPriority() < arg1.getPriority())
        {
            return 1;
        }
        if (arg0.getPriority() > arg1.getPriority())
        {
            return -1;
        }
        return 0;
    }

}
