package functionalInterfaces;

public class DemoOnRunnable {
    //1. Create a class for the task
    //2. Make this class implements Runnable interface.
    //3. Implement run() method.
    //4. Create Thread Object.
    //5. Pass task object to the thread.
    //6. call thread.start();

    public static void main(String[] args) {
        System.out.println("Hello World: " + Thread.currentThread().getName());

        Runnable runnable = () -> {
            System.out.println("Hello World: " + Thread.currentThread().getName());
        };
        Thread t = new Thread(runnable);
        t.start();

        Runnable runnable1 = () -> {
            System.out.println("Hello World: " + Thread.currentThread().getName());
        };
        Thread t1 = new Thread(runnable1);
        t1.start();
    }
}
