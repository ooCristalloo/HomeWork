package homeWorks_second;

import homeWorks_second.listNode.ListNode;

public class HomeWork_second {

    public ListNode mainNode = null;

    public void run() {
        this.createMainNode();
        this.linkNodes(this.mainNode, this.createNode(this.mainNode.getValue() + 1));
        System.out.println(this.getLastNode());
        for (int i = 1; i <= 5; i++) {
            this.linkNodes(this.getLastNode(), this.createNode(this.getLastNode().getValue() + 1));
        }
        System.out.println("Размер списка: " + this.getSizeNodes());
        System.out.println("Поиск по списку: " + this.getByIndex(2));
    }

    public ListNode getByIndex(int index_search) {
        ListNode lastNode = this.mainNode;
        while (lastNode != null) {
            lastNode = this.mainNode.getNextNode();
            int index = lastNode.getValue();
            if (index == index_search) {
                return lastNode;
            }
        }
        throw new UnsupportedOperationException();
    }

    public int getSizeNodes() {
        ListNode lastNode = this.mainNode;
        int i = 0;
        while (lastNode != null) {
            lastNode = lastNode.getNextNode();
            i++;
        }
        return i;
    }

    public ListNode getLastNode() {
        ListNode lastNode = this.mainNode;
        while (lastNode != null) {
            lastNode = lastNode.getNextNode();
        }
        return lastNode;
    }

    public String asString(ListNode head) {
        StringBuilder sb = new StringBuilder();
        ListNode lastNode = this.mainNode;
        while (lastNode != null) {
            lastNode = lastNode.getNextNode();
            sb.append(lastNode.getValue()).append(" ->");
        }
        return sb.toString();
    }

    public void linkNodes(ListNode firstNode, ListNode secondNode) {
        firstNode.linkNode(secondNode);
    }

    public ListNode createNode(int value) {
        return new ListNode(value);
    }

    public void createMainNode() {
        this.mainNode = this.createNode(1);
    }
}
