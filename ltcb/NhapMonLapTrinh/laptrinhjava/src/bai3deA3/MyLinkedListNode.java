package bai3deA3;

public class MyLinkedListNode {
    private Object payload;
    private MyLinkedListNode next;
//uy dau ghe an cut yeu ha anh, bi ha anh me hoac oc cho chu no xau vl ra
    //choi game thi bu win
    public MyLinkedListNode(Object payload) {
        /* TODO */
        this.payload = payload;
    }

    public MyLinkedListNode(Object payload, MyLinkedListNode next) {
        /* TODO */
        this.payload = payload;
        this.next = next;
    }

    public Object getPayload() {
        /* TODO */
        return payload;
    }

    public MyLinkedListNode getNext() {
        /* TODO */
        return next;
    }

    public void setNext(MyLinkedListNode node) {
        /* TODO */
        this.next = node;
    }
}

