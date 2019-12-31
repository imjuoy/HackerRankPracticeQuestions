package MultiThreading;

class DefineThread implements Runnable {
	public void run() {
		try {
			System.out.println("The current thread that is running is :: " + Thread.currentThread().getName());
		} catch (Exception e) {
			System.out.println("Exception caught!!");
		}
	}
}

public class ThreadCreationUsingRunnable {

	public static void main() {
		int i;
		for (i = 0; i <= 8; i++) {
			Thread th = new Thread(new DefineThread());
			th.start();
		}
	}
}
