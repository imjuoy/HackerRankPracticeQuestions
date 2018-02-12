
public class InsertAtHeadOfLinkedlist {
	
	class Node {
	     int data;
	     Node next;
	  }

	Node Insert(Node head,int x) {
	    
	     Node newNode =  new Node();
	     newNode.data = x;
	     newNode.next = head;
	     return newNode;    
	    
	}


}
