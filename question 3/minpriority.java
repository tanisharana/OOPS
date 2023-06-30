public class minpriority extends Thread {
    public void run() {
        System.out.println("Priority of thread is: " + Thread.currentThread().getPriority());
    }

    public static void main(String args[]) {
        // creating one thread
        minpriority t1 = new minpriority();
        // print the minimum priority of this thread
        t1.setPriority(Thread.MIN_PRIORITY);
        // This will call the run() method
        t1.start();
    }
}