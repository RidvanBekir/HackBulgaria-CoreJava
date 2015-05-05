package StackTasks;
import java.util.ArrayList;

public class Stack implements StackInterface {

    ArrayList<Object> stack = new ArrayList<Object>();

    public Stack() {
    }

    public void addElement(Object object) {

        if (findElementIndex(object) == "Not found") {
            stack.add(object);
            System.out.println("Element added!");
        } else {
            System.out.println("This element is already in the stack !");
        }
    }

    public void addElement(int index, Object object) {

        if (index > length()) {
            stack.add(length(), object);
            System.out.println("Your element is added in index : " + (length() - 1));
        } else {
            System.out.println("Element added!");
            stack.add(index, object);
        }

    }

    @Override
    public void deleteElement(int index) {

        stack.remove(index);

    }

    @Override
    public String findElementIndex(Object object) {

        String string;
        for (int i = 0; i < stack.size(); i++) {

            if (stack.get(i).equals(object)) {
                string = i + "";
                return string;
            }
        }
        return "Not found";
    }

    @Override
    public boolean isStackEmpty() {

        return stack.isEmpty();

    }

    @Override
    public int length() {

        return stack.size();

    }

}
