package oop9.EX1_1;

public class MyLinkList extends MyAbstracList {
    private MyLinkListNode head;
    private int size;

    public MyLinkList() {
        head = null;
        size = 0;
    }

    private MyLinkListNode getNodeByIndex(int index) {
        this.checkBoundaries(index, size + 1);
        MyLinkListNode tempNode = head;
        for (int i = 0; i < index; i++) {
            tempNode = tempNode.getNext();
        }
        return tempNode;
    }

    @Override
    public void add(Object payload) {
        add(payload, size);
    }

    @Override
    public void add(Object payload, int index) {
        this.checkBoundaries(index, size+1);
        if (index == size - 1) {
            this.add(payload);
        } else if (index == 0) {
            MyLinkListNode currentNode = new MyLinkListNode(payload, head);
            this.head = currentNode;
        } else {
            MyLinkListNode currentNode = getNodeByIndex(index-1);
            currentNode.setNext(new MyLinkListNode(payload , currentNode.getNext()));
        }
        size++;
    }

    @Override
    public void remove(int index) {
        this.checkBoundaries(index, size + 1);
        if (index == 0) {
            if (size > 1) {
                this.head = head.getNext();
            } else {
                this.head = null;
            }
            size--;
            return;
        }
        if (index == size - 1) {
            MyLinkListNode prevNode = this.getNodeByIndex(index - 1);
            prevNode.setNext(null);
        }
        // Xoa phần tử bất kì bằng cách liên kết 2 phần tử truóc và sau index với nhau
        MyLinkListNode prevNode = this.getNodeByIndex(index - 1);
        MyLinkListNode nextNode = this.getNodeByIndex(index + 1);
        prevNode.setNext(nextNode);
        size--;
    }

    @Override
    public Object get(int index) {
        this.checkBoundaries(index, size);
        return this.getNodeByIndex(index).getPayload();
    }

    @Override
    public int size() {
        return this.size;
    }
}

