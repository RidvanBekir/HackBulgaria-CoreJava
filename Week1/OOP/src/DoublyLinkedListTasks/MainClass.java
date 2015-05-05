package DoublyLinkedListTasks;
public class MainClass {

    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();
        list.addElemet("Ridvan");
        list.addElemet(10);
        list.addElemet("Java");
        System.out.println(list.isEmpty());
        list.deleteElement(4);
        list.viewListContent();
        list.getFirst();
        list.getLast();
        list.get(2);
        System.out.println();
        Stack stack = new Stack();
        stack.pushElement("HackBulgaria");
        stack.pushElement("JavaCore");
        System.out.println(stack.isStackEmpty());
        System.out.println(stack.size());

    }

}
