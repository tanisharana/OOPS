import java.util.Random;

class MultithreadingDemo extends Thread {

	public void run() {
		Random random = new Random();
		int rand = random.nextInt(1, 11);
		try {
			Thread.currentThread().setPriority(rand);
			System.out.println("Thread No: " + Thread.currentThread().getId() + " cand the priority is: "
					+ Thread.currentThread().getPriority());

		} catch (Exception e) {
			System.out.println("Exception is caught");

		}

	}

}

public class Multithreading {
	public static void main(String[] args) {
		int n = 8; // total number of threads
		for (int i = 0; i < n; i++) {
			MultithreadingDemo obj = new MultithreadingDemo();
			obj.start();
		}

	}

}