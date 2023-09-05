package bai3;

import java.util.NoSuchElementException;

public class MyLinkedList extends MyAbstractList {
    private MyLinkedListNode head;
    private int size;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public MyLinkedList() {
        head = null;
        size = 0;
    }

    /**
     * Lấy kích thước của list.
     *
     * @return
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Lấy phần tử ở vị trí index trong list.
     *
     * @param index
     * @return
     */
    @Override
    public Object get(int index) {
        MyLinkedListNode node = getNodeByIndex(index);
        return node.payload;
    }

    /**
     * Sửa phần tử ở vị trí index là payload.
     *
     * @param payload
     * @param index
     */
    @Override
    public void set(Object payload, int index) {
        MyLinkedListNode node = getNodeByIndex(index);
        node.payload = payload;
    }

    /**
     * Xóa phần tử của list ở vị trí index.
     *
     * @param index
     */
    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of range.");
        }

        if (index == 0) {
            head = head.next;
        } else {
            MyLinkedListNode prevNode = getNodeByIndex(index - 1);
            MyLinkedListNode currentNode = prevNode.next;
            prevNode.next = currentNode.next;
        }

        size--;
    }

    /**
     * Thêm vào cuối list phần tử có dữ liệu payload.
     *
     * @param payload
     */
    @Override
    public void append(Object payload) {
        MyLinkedListNode newNode = new MyLinkedListNode(payload);

        if (head == null) {
            head = newNode;
        } else {
            MyLinkedListNode lastNode = getNodeByIndex(size - 1);
            lastNode.next = newNode;
        }

        size++;
    }

    /**
     * Thêm vào list phần tử có dữ liệu payload ở vị trí index.
     *
     * @param payload
     * @param index
     */
    @Override
    public void insert(Object payload, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index is out of range.");
        }

        MyLinkedListNode newNode = new MyLinkedListNode(payload);

        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            MyLinkedListNode prevNode = getNodeByIndex(index - 1);
            newNode.next = prevNode.next;
            prevNode.next = newNode;
        }

        size++;
    }

    /**
     * Tạo iterator để cho phép duyệt qua các phần tử của list.
     *
     * @return
     */
    @Override
    public MyIterator iterator() {
        return new MyLinkedListIterator();
    }

    /**
     * Lấy node ở vị trí index.
     *
     * @param index
     * @return
     */
    private MyLinkedListNode getNodeByIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of range.");
        }

        MyLinkedListNode currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }

        return currentNode;
    }

    /*
     * Inner class implements the Iterator pattern
     */
    private class MyLinkedListIterator implements MyIterator {
        /*
         * MyLinkedListIterator cần phải biết vị trí hiện tại khi nó đang duyệt qua dữ liệu của MyLinkedList.
         */
        private MyLinkedListNode currentNode;

        /**
         * Khởi tạo dữ liệu cho Iterator là vị trí node đầu tiên trong MyLinkedList.
         */
        public MyLinkedListIterator() {
            currentNode = head;
        }

        /**
         * Kiểm tra trong MyLinkedList có còn phần tử tiếp theo không.
         * Nếu còn thì trả về true, nếu không còn thì trả về false.
         *
         * @return
         */
        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        /**
         * iterator dịch chuyển sang phần tử kế tiếp của MyLinkedList và trả ra dữ liệu (payload) của phần tử hiện tại của MyLinkedList.
         *
         * @return payload của phần tử hiện tại.
         */
        @Override
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements in the list.");
            }

            Object currentPayload = currentNode.payload;
            currentNode = currentNode.next;
            return currentPayload;
        }

        /**
         * iterator xóa phần tử hiện tại của MyLinkedList.
         */
        @Override
        public void remove() {
            throw new UnsupportedOperationException("Remove operation is not supported.");
        }
    }

    /*
     * Inner class represents a node in the linked list
     */
    private class MyLinkedListNode {
        private Object payload;
        private MyLinkedListNode next;

        public MyLinkedListNode(Object payload) {
            this.payload = payload;
            this.next = null;
        }
    }
}
