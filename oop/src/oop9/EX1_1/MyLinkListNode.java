package oop9.EX1_1;

public class MyLinkListNode {
    private Object payload;
    private MyLinkListNode next;

    public MyLinkListNode(Object payload){
         this.payload = payload;
         this.next=null;
    }

    public MyLinkListNode() {
    }

    public MyLinkListNode(Object payload , MyLinkListNode next){
        this.payload = payload;
        this.next = next;
    }
    public Object getPayload(){
        return payload;
    }
    public void setPayload (Object dataValue){
        this.payload = dataValue;
    }

    public MyLinkListNode getNext() {
        return next;
    }

    public void setNext(MyLinkListNode next) {
        this.next = next;
    }
}
