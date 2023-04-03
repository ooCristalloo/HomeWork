package homeWorks_second.listNode;

public class ListNode {

    private final int value;
    private ListNode next = null;

    public ListNode(int value) {
        this.value = value;
    }

    public ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }

    public int getValue() {
        return this.value;
    }

    public void linkNode(ListNode node) {
        this.next = node;
    }

    public ListNode getNextNode() {
        return this.next;
    }
}
