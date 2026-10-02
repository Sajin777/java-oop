class Worker extends Thread {
    private final String name;

    Worker(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(name + " -> " + i);
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Worker("Worker-A");
        Thread t2 = new Worker("Worker-B");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Main thread finished");
    }
}
