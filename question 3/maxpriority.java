public class maxpriority extends Thread {
    public void run() {
        System.out.println("Priority of thread is: " + Thread.currentThread().getPriority());
    }

    public static void main(String args[]) {
        // creating one thread
        maxpriority t1 = new maxpriority();
        // print the maximum priority of this thread
        t1.setPriority(Thread.MAX_PRIORITY);
        // call the run() method
        t1.start();
    }
}