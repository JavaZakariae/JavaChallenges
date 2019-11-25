package challenge51_60;

/**
 *   broerSupplier.provideBroer(Integer.valueOf(3))---> Broer(int any) will be called because it is the best match
 *
 */
public class Challenge_52 {

    public static void main( String[] args ) {
        BroerSupplier broerSupplier = Broer::new;/*no instantiation in that line*/
        short s =1;
        broerSupplier.provideBroer(s);//the construtur will be called in that line
        broerSupplier.provideBroer(10);
        broerSupplier.provideBroer(1);
    }

    static class Broer{
       Broer(int any){
            System.out.println("int" + any);
        }

       Broer(short any){
            System.out.println("short" + any);
        }
        Broer(Integer any){
            System.out.println("Integer" + any);
        }
    }
    private interface BroerSupplier{
        Broer provideBroer(int quantity);
    }
}
