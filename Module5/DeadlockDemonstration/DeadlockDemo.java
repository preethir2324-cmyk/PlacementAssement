package Exception.DeadlockDemonstration;

public class DeadlockDemo {

    public static void main(String[] args) {

        final String resource1 = "A";
        final String resource2 = "B";

        Thread t1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1 locked resource 1");
                try { Thread.sleep(100); } catch (Exception e) {}
                synchronized (resource2) {
                    System.out.println("Thread 1 locked resource 2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2 locked resource 2");
                try { Thread.sleep(100); } catch (Exception e) {}
                synchronized (resource1) {
                    System.out.println("Thread 2 locked resource 1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}