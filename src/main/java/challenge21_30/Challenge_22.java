package challenge21_30;

/**
 * overloaded method priority
 *      widening-->boxing--->varargs
 */
public class Challenge_22 {
    public static String finalResult = "";
    public static void main( String[] args ) {
        executeAction(1, true);//2
        executeAction();//3
        executeAction(new int[]{1,2,3}, 1);//2
        executeAction(1L);//5
        executeAction(1);//5
        executeAction(Double.valueOf(1));//1
    }

    static void executeAction(Object o){finalResult+="1";}
    static void executeAction(Object... o){finalResult+="2";}
    static void executeAction(StackOverflowError... o){finalResult+="3";}
    static void executeAction(Long o){finalResult+="4";}
    static void executeAction(double o){finalResult+="5";}
}
