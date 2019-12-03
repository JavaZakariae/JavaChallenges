package challenge51_60;

/**
 *  To create a thread ---> we can inherit from the Thread class.
 *  To run the thread ---> thread.start()
 *  thread.join() --->
 *
 *  We can't start a thread more than one time.
 *
 */
public class Challenge_54 {

    public static void main( String[] args ) throws InterruptedException {
        Thread thread = new MyThread();
        thread.start();
        thread.join();

        thread.start();
        thread.join();
    }

    static class MyThread extends Thread{
        @Override
        public void run(){
            System.out.println("I'm alive");
        }
    }
}
