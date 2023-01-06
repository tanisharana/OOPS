import java.io.*;
import java.util.*;

public class Threadjoining extends Thread {
	public void run() {
		for (int i = 1; i <= 4; i++) {
			try {
				Thread.sleep(500);

			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}

	}

	public static void main(String args[]) {
		Threadjoining obj1 = new Threadjoining();
		Threadjoining obj2 = new Threadjoining();
		Threadjoining obj3 = new Threadjoining();
		obj1.start();

		try {
			obj1.join();
		} catch (Exception e) {

			System.out.println(e);

		}
		obj2.start();
		obj3.start();

	}

}