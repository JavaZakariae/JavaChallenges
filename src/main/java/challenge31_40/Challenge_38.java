package challenge31_40;

/**
 * Method reference vs Lambda
 * Lambda expression as runnable implementation will be not executed only if we call the run method.
 *   + in every run() call, a new instance is created (constructor call).
 *   + Lambda is lazy
 *
 * Method reference
 *  the constructor is called only one time, the method reference is called only if we call the run method.
 *
 * // TODO: 11/11/2019
 * what are the implementation we can pass to the Runnable interface.
 */
public class Challenge_38 {

    public static void main( String[] args ) {
        Runnable universeImpactRunnable = () -> new ChuckNorris().roundHouseKick();
        Runnable galaxyImpactRunnable = new ChuckNorris()::roundHouseKick;

        System.out.println("The galaxy is finished = ");

        universeImpactRunnable.run();
        universeImpactRunnable.run();

        galaxyImpactRunnable.run();
        galaxyImpactRunnable.run();
    }

    static class ChuckNorris{
        private static int numberOfKicks;
        private int galaxyDamage;

        public ChuckNorris() {
            this.galaxyDamage = numberOfKicks++;
        }
        void roundHouseKick(){
            System.out.println(this.galaxyDamage);
        }
    }
}
