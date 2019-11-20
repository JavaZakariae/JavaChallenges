package challenge41_50;

/**
 * StringBuffer  threadSafe
 * StringBuilder not threadSafe
 * String are immutable, StringBuffer are not.
 */
public class Challenge_48 {

    public static void main( String[] args ) {
        String s = "Height";
        StringBuffer stringBuffer = new StringBuffer("sword");
        testRefs(s,stringBuffer);
        System.out.println("s = " + s+" sb = " + stringBuffer);
    }

    static void testRefs(String str, StringBuffer stringBuffer){
        str = str + stringBuffer.toString();
        stringBuffer.append(str);
        str=null;
        stringBuffer=null;
    }
}
