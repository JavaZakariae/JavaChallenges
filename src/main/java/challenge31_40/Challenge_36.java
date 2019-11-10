package challenge31_40;

/**
 *  StackOverflowError extend  VirtualMachineError extends Error
 *  we can throw an exception from a method without any return statement declaration
 *  StackOverflowError can be catch by a catch block statement catch (StackOverflowError e){}
 *
 *
 */
public class Challenge_36 {

    static int kratos, zeus, hades;

    public static void main( String[] args ) {
        try {
            invokeAGod(kratos=1, lightningOfZeus(zeus=2), hades=3);
        }catch (Exception e){
            System.out.println(kratos+" "+ zeus+" "+  hades);
        }
    }

    private static int invokeAGod( int a, int b, int c ) {
        return a+b+c;
    }

    private static int lightningOfZeus( int i ) throws Exception {
        throw new StackOverflowError("Woow");
    }

}
