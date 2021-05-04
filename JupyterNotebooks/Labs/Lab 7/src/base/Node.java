package base;

public class Node {
    int value;
    Node nextNode;

    public Node(int value) {
        this.value = value;
        this.nextNode = null;
    }
    public Node head=null;
    public Node tail=null;

    public Node add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.nextNode = newNode;
            tail = newNode;
        }
        return newNode;
    }
    public void delete(int remove) {
        Node temp = head, current = null;
        if (temp != null && temp.value == remove) {
            head = temp.nextNode;
            return;
        }
        while (temp != null && temp.value != remove) {
            current =temp;
            temp = temp.nextNode;
        }
        if (temp == null)
            return;
        current.nextNode = temp.nextNode;
    }
    public void sortList() {
        Node current = head, sort = null;
        int temp;
        if (head == null) {
            return;
        }else{
            while (current != null) {
                sort=current.nextNode;
                while (sort != null) {
                    if (current.value > sort.value) {
                        temp = current.value;
                        current.value = sort.value;
                        sort.value = temp;
                    }
                    sort = sort.nextNode;
                }current=current.nextNode;
            }
        }
    }
}

