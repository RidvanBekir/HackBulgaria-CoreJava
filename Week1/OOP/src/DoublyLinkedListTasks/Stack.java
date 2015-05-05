package DoublyLinkedListTasks;
public class Stack implements StackInterface {

    DoublyLinkedList stack;

    public Stack() {
        this.stack = list();
    }

    protected static DoublyLinkedList list() {
        return new DoublyLinkedList();
    }

    @Override
    public void pushElement(Object object) {
        stack.addElemet(object);
    }

    @Override
    public void deleteElement(int index) {
        stack.deleteElement(index);
    }

    @Override
    public boolean isStackEmpty() {
        return stack.isEmpty();
    }

    @Override
    public int size() {
        return stack.getLenght();
    }

}
