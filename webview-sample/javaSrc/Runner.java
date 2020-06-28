/*
Class that has a main method that creates the data structure
and runs some code on it.
*/

package javaSrc;

public class Runner{

	public static LinkedListNode modifyLinkedList(LinkedListNode head){
		// removes head node
		return head.getNext();

	}

	public static void main(String[] args) {
		LinkedListNode n3 = new LinkedListNode(1);
        LinkedListNode n2 = new LinkedListNode(2, n3);
		LinkedListNode head = new LinkedListNode(3, n2);
		//visualize
		LinkedListNode newHead = modifyLinkedList(head);
		//visualize
		System.out.println(newHead.getData());
	}

}