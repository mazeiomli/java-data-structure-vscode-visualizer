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
		// Create LinkedList
		LinkedListNode n3 = new LinkedListNode("n3", 3);
		LinkedListNode n2 = new LinkedListNode("n2", 2, n3);
		LinkedListNode head = new LinkedListNode("n1", 1, n2);
		// visualize
		// convert data struc to json
		ConvertGraphlikeToJSON.convertLinkedListToJSON(head, "before-data-struc.json");
		
		// Remove the head node
		LinkedListNode newHead = modifyLinkedList(head);
		//visualize
		ConvertGraphlikeToJSON.convertLinkedListToJSON(newHead, "after-data-struc.json");

		// should print 2
		System.out.println(newHead.getData());
	}

}