package javaSrc;

public class LinkedListNode{

    private int data;
    private LinkedListNode next;

    LinkedListNode(int i){
        setData(i);
        setNext(null);
    }
    LinkedListNode(int i, LinkedListNode nxt){
        setData(i);
        setNext(nxt);
    }

    public int getData(){
        return this.data;
    }
    public LinkedListNode getNext(){
        return this.next;
    }

    public void setData(int data){
        this.data = data;

    }
    public void setNext(LinkedListNode next){
        this.next = next;
    }

}