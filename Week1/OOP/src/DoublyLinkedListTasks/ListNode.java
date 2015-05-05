package DoublyLinkedListTasks;
public class ListNode {

    private ListNode previous;
    private ListNode next;
    private Object object;

    public ListNode() {

        previous = null;
        next = null;
        object = null;

    }

    public ListNode(ListNode prev, ListNode next, Object obj) {

        this.previous = prev;
        this.next = next;
        this.object = obj;

    }

    public void setLinkNext(ListNode next) {
        this.next = next;
    }

    public void setLinkPrevious(ListNode prev) {
        this.previous = prev;
    }

    public ListNode getLinkNext() {
        return next;
    }

    public ListNode getLinkPrevious() {
        return previous;
    }

    public void setData(Object obj) {
        this.object = obj;
    }

    public Object getData() {
        return object;
    }

}
