package DoublyLinkedListTasks;
public class DoublyLinkedList {

    private ListNode beginning;
    private ListNode end;
    private int length;

    public DoublyLinkedList() {

        beginning = null;
        end = null;
        length = 0;

    }

    public boolean isEmpty() {
        return beginning == null;
    }

    public int getLenght() {
        return length;
    }

    public void addElemet(Object object) {
        ListNode node = new ListNode(null, null, object);
        if (beginning == null) {
            beginning = node;
            end = beginning;
        } else {
            node.setLinkPrevious(end);
            end.setLinkNext(node);
            end = node;
        }
        length++;
    }

    public void deleteElement(int position) {

        if (position > length || position < 1) {
            System.out.println("No element to delete with such position!");
        }
        if (position == 1) {
            if (length == 1) {
                beginning = null;
                end = null;
                length = 0;
                return;
            }
            beginning = beginning.getLinkNext();
            beginning.setLinkPrevious(null);
            length--;
            return;
        }
        if (position == length) {
            end = end.getLinkPrevious();
            end.setLinkNext(null);
            length--;
        }
        ListNode node = beginning.getLinkNext();
        for (int i = 2; i <= length; i++) {
            if (i == position) {
                ListNode prev = node.getLinkPrevious();
                ListNode next = node.getLinkNext();

                prev.setLinkNext(next);
                next.setLinkPrevious(prev);
                length--;
                return;
            }
            node = node.getLinkNext();
        }
    }

    public void viewListContent() {
        if (length == 0) {
            System.out.print("The list is empty\n");
            return;
        }
        if (beginning.getLinkNext() == null) {
            System.out.println(beginning.getData());
            return;
        }
        ListNode node = beginning;
        System.out.print(beginning.getData() + "  ");
        node = beginning.getLinkNext();
        while (node.getLinkNext() != null) {
            System.out.print(node.getData() + "  ");
            node = node.getLinkNext();
        }
        System.out.print(node.getData() + "\n");
    }

    public void getFirst() {
        if (length == 0) {
            System.out.print("The list is empty\n");
            return;
        } else {
            System.out.println(beginning.getData());
        }
    }

    public void getLast() {
        if (length == 0) {
            System.out.print("The list is empty\n");
            return;
        } else {
            System.out.println(end.getData());
        }
    }

    public void get(int elementIndex) {
        if (elementIndex < 1 || elementIndex > length) {
            System.out.println("No element in such position");
        }
        if (elementIndex == 1) {
            getFirst();
        }
        if (elementIndex == length) {
            getLast();
        }
        ListNode node = beginning.getLinkNext();
        for (int i = 2; i <= length; i++) {
            if (i == elementIndex) {
                System.out.println(node.getData());
            }
            node = node.getLinkNext();
        }
    }
}
