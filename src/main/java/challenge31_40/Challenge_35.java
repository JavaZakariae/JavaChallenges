package challenge31_40;

/**
 *  Daemon thread : https://stackoverflow.com/questions/2213340/what-is-a-daemon-thread-in-java
 *                  is a thread that does not prevent the JVM from exiting.
 *                  an example of a daemon thread is the garbage collector.
 */
public class Challenge_35 {
    private static int nummer = 10;
    public static void main( String[] args ) {
        new MotorCycle("Harley Davidson").start();

        MotorCycle motorCycle = new MotorCycle("Dodge Tomahawk");
        motorCycle.setPriority(Thread.MAX_PRIORITY);
        motorCycle.setDaemon(true);
        motorCycle.start();

        MotorCycle yamaha = new MotorCycle("Yamaha");
        yamaha.setPriority(Thread.MIN_PRIORITY);
        yamaha.setDaemon(true);
        yamaha.start();
    }
    static class MotorCycle extends Thread {
        public MotorCycle( String name ) {
            super(name);
        }

        @Override
        public void run() {
            nummer++;
            if (nummer==13)
                System.out.println(this.getName());
        }
    }
}
