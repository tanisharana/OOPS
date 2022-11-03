public class multi {
    public static void main(String[] args) {
        Thread Thread1 = new Thread("Thread 1");
        Thread Thread2 = new Thread("Thread 2");
        Thread1.start();
        Thread2.start();
        System.out.println("thread names are");
        System.out.println(Thread1.getName());
        System.out.println(Thread2.getName());
    }

    public void run() {
    }
}
