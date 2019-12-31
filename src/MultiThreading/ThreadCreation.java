package MultiThreading;

/*
 * Multi-threading is used for concurrent execution of two or more parts of a program, so that it can utilize the CPU ( which is a scarce
 * resource) to its maximum.
 * Threads can be created in two ways:
 * 1. Extending the Thread class 
 * 2. Implementing the runnable interface.
 * The below program will create Threads by extending the Thread class. When a class extends the Thread class, it has to override the run()
 * method inside of the Thread class. The life-cycle of a thread starts inside of the run() method in the Thread class.
 */

class MultiThreadingUsingThread extends Thread {
	public void run() {
		// Displaying the name of the current thread that is running.
		try {
			System.out.print("The current thread that is running is ::" + Thread.currentThread().getName());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

public class ThreadCreation {

	public static void main() {
		int i;
		// The below number depicts the number of threads that will be created. In this
		// case, we can see that number is 9.
		for (i = 0; i <= 8; i++) {
			MultiThreadingUsingThread m = new MultiThreadingUsingThread();
			m.start();
		}
	}

}
