package DataStructures;

public class StackusingArray {

	int top;
	int size;
	int capacity;
	int[] array;

	public StackusingArray(int capacity) {
		this.capacity = capacity;
		this.top = -1;
		this.size = 0;
		array = new int[capacity];
	}

	public boolean push(int item) {
		if (top > size)
			return false;
		else {
			array[++top] = item;
			size++;
			return true;
		}
	}

	public int pop() {
		if (top > size)
			return -1;
		else {
			int item = array[top];
			top--;
			return item;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackusingArray a = new StackusingArray(4);
		a.push(4);
		a.push(5);
		a.push(6);

		System.out.println(a.pop());
	}

}
