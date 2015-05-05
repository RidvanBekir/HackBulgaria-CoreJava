package StackTasks;
public interface StackInterface {

    void addElement(Object object);

    void addElement(int index, Object object);

    void deleteElement(int index);

    String findElementIndex(Object object);

    boolean isStackEmpty();

    int length();

}
