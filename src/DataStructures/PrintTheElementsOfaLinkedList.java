package DataStructures;

public class PrintTheElementsOfaLinkedList {
	/*
	  Print elements of a linked list on console 
	  head pointer input could be NULL as well for empty list
	  Node is defined as 
	 */
	  class Node {
	     int data;
	     Node next;
	  }
	

	// This is a "method-only" submission. 
	// You only need to complete this method. 
	    
	void Print(Node head) {
	     while (head != null)
	     {
	         
	         int data = head.data;
	         System.out.println(data);
	         head = head.next;
	     }
	  } 

}
