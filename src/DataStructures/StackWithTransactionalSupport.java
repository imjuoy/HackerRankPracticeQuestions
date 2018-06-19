/**
 * Implement a stack data structure which supports push,pop and top transactions.
 * However the stack data structure also needs to have support for transactions which include:
 * Begin:
 * When the user issues this command, the transaction block starts.
 * There can be multiple begin blocks under one particular begin block.
 * 
 * Rollback:
 * This is used to rollback the current block of transaction.
 * 
 * Commit::
 * This will commit all the open transaction blocks.
 * 
 * Example:
 * 
 * StackWithTransactionalSupport s1 = new StackWithTransactionalSupport()
 * s1.push(4);
 * s1.push(5);
 * stack currently is 4,5
 * 
 * s1.begin
 * --This is the start of transaction 1
 * 
 * s1.push(6)
 * stack is 4,5,6
 * 
 * s1.rollback()
 * stack is 4,5
 * 
 * s1.push(7)
 * stack is 4,5,7
 * 
 * s1.begin
 * transaction 2
 * 
 * s1.commit 
 * 
 * stack - 4,5,7
 *
 * 
 */

package DataStructures;

import java.util.Stack;

public class StackWithTransactionalSupport {

	private Stack<Integer> data;
	private Stack<Stack<Integer>> transaction;

	public StackWithTransactionalSupport() {
		data = new Stack<Integer>();
		transaction = new Stack<Stack<Integer>>();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
