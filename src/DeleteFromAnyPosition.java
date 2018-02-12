public class DeleteFromAnyPosition {
	 class Node {
	     int data;
	     Node next;
	  }
	 
	 Node Delete(Node head, int position) {
		  if(head == null)
		  {
		     return head;
		  }
		  if(position == 0)
		  {
		    head = head.next;
		    return head;
		   }
		  else
		  {
		      Node prev = null;
		      Node curr = head;
		      int counter =0;
		      while( counter < position && curr != null)
		      {
		       prev = curr;
		       curr = curr.next;
		       counter ++;
		      } 
		      prev.next = curr.next;
		      return head;
		  }

	 }
}
