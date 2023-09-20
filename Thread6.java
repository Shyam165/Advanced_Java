public class Thread6 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread 1 started");
            try {
                Thread.sleep(2000); // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 1 completed");
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("Thread 2 started");
            try {
                Thread.sleep(3000); // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 2 completed");
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join(); // Main thread waits for thread1 to complete
            thread2.join(); // Main thread waits for thread2 to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All threads completed");
    }
}
