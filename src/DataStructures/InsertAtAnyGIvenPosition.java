package DataStructures;

public class InsertAtAnyGIvenPosition {
	
	 class Node {
	     int data;
	     Node next;
	  }
	 
	 Node InsertNth(Node head, int data, int position) {
		   // This is a "method-only" submission. 
		    // You only need to complete this method. 
		     Node headData = head;
		     Node newNode = new Node();
		     newNode.data = data;
		    if(head == null)
		    {
		     //newNode.next = null;
		     return newNode;
		    }
		    else if(position == 0)
		    {
		      newNode.next = head;
		      return newNode;
		    }
		    else
		    {
		     int nodeCounter = 0;
		     Node prev = null;
		     while(nodeCounter < position && headData != null)
		     {
		       prev = headData;
		       headData = headData.next;  
		       nodeCounter++;  
		     }
		        
		     newNode.next = prev.next;
		     prev.next = newNode;
		     return head;
		    }
	 }

}
