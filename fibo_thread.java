public class fibo_thread implements Runnable {
    private int x;
    public int answer;

    public fibo_thread(int x) {
        this.x = x;
    }

    public void run() {
        if (x < 2)
            answer = 1;
        else {
            try {
                fibo_thread f1 = new fibo_thread(x - 1);
                fibo_thread f2 = new fibo_thread(x - 2);
                Thread threadf1 = new Thread(f1);
                Thread threadf2 = new Thread(f2);
                threadf1.start();
                threadf2.start();
                threadf1.join();
                threadf2.join();

                answer = f1.answer + f2.answer;

            } catch (InterruptedException ex) {
            }
        }
    }

    public static void main(String[] args)

    {
        try {

            for (int i = 0; i < 19; i++) {
                fibo_thread f = new fibo_thread(i);
                Thread threadf = new Thread(f);
                threadf.start();
                threadf.join();

                System.out.println(f.answer);

            }
        }

        catch (Exception e) {
            System.out.println("usage: java fibo_thread NUMBER");
        }
    }
}