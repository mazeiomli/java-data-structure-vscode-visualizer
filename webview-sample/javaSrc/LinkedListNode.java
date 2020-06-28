package javaSrc;

public class LinkedListNode{

    // unique identifier. serves as node name
    private String uid;
    private int data;
    private LinkedListNode next;

    LinkedListNode(String id, int i){
        setUID(id);
        setData(i);
        setNext(null);
    }
    LinkedListNode(String id, int i, LinkedListNode nxt){
        setUID(id);
        setData(i);
        setNext(nxt);
    }

    public int getData(){
        return this.data;
    }

    public void setData(int data){
        this.data = data;
    }

    public LinkedListNode getNext(){
        return this.next;
    }
    public void setNext(LinkedListNode next){
        this.next = next;
    }

    public String getUID(){
        return this.uid;
    }

    public void setUID(String str){
        this.uid = str;
    }

}