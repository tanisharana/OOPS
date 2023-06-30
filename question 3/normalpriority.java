public class normalpriority extends Thread {
    public void run() {
        System.out.println("Priority of thread is: " + Thread.currentThread().getPriority());
    }

    public static void main(String args[]) {
        // creating one thread
        normalpriority t1 = new normalpriority();
        // print the normal priority of this thread
        t1.setPriority(Thread.NORM_PRIORITY);
        // starting the thread
        t1.start();
    }
}