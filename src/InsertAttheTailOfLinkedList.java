
public class InsertAttheTailOfLinkedList {
	 class Node {
	     int data;
	     Node next;
	  }
	 Node Insert(Node head,int data) {
		// This is a "method-only" submission. 
		// You only need to complete this method. 
		    Node newNode = new Node();
		    newNode.data = data;
		    newNode.next = null;
		    if( head == null)
		    {
		       head = newNode; 
		       return head;
		    }
		    
		    Node curr = head;
		    while(curr.next != null)
		    {   
		    curr=curr.next;
		    }
		    curr.next = newNode;
		    return head;
		  
		}

}
