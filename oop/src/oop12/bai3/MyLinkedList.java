package oop12.bai3;

public class MyLinkedList extends MyAbstractList {
    private MyLinkedListNode head;
    private int size;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public MyLinkedList() {
        this.head = null;
        this.size = 0;
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
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return getNodeByIndex(index).getPayload();
    }
    //Sửa phần tử tại vị trí index
    @Override
    public void set(Object payload, int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        getNodeByIndex(index).setPayload(payload);
    }

    /**
     * Xóa phần tử của list ở vị trí index.
     *
     * @param index
     */
    @Override
    public void remove(int index) {
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
            MyLinkedListNode prevNode = this.getNodeByIndex(index - 1);
            prevNode.setNext(null);
        }
        // Xoa phần tử bất kì bằng cách liên kết 2 phần tử truóc và sau index với nhau
        MyLinkedListNode prevNode = this.getNodeByIndex(index - 1);
        MyLinkedListNode nextNode = this.getNodeByIndex(index + 1);
        prevNode.setNext(nextNode);
        size--;
    }
    /**
     * Thêm vào cuối list phần tử có dữ liệu payload.
     *
     * @param payload
     */
    @Override
    public void append(Object payload) {
        if (size == 0) {
            head = new MyLinkedListNode(payload);
        }else{
            getNodeByIndex(size-1).setNext(new MyLinkedListNode(payload));
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
            throw new ArrayIndexOutOfBoundsException();
        }
        if (index == 0) {
            head = new MyLinkedListNode(payload, head);
            size++;
        } else if (index == size) {
            append(payload);
        } else {
            MyLinkedListNode cur = getNodeByIndex(index - 1);
            cur.setNext(new MyLinkedListNode(payload, cur.getNext()));
            size++;
        }
    }

    /**
     * Tạo iterator để cho phép duyệt qua các phần tử của list.
     *
     * @return
     */
    @Override
    public MyIterator iterator() {
        return new MyLinkedListIterator(head);
    }

    /**
     * Lấy node ở vị trí index.
     *
     * @param index
     * @return
     */
    private MyLinkedListNode getNodeByIndex(int index) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        MyLinkedListNode cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.getNext();
        }
        return cur;
    }
}
