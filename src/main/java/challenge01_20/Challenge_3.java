package challenge01_20;

import java.io.Closeable;
import java.io.IOException;

/**
 *  Every class that implements those two interfaces can be closed automatically in a try with resource block.
 *
 *  Closeable vs AutoCloesable
 *              @link{https://stackoverflow.com/questions/13141302/implements-closeable-or-implements-autocloseable}
 *  Closeable extends AutoCloseable.
 *  Closeable close() method throws IOException.
 *  AutoCloseable close() method throws Exception.
 *
 *  Inner static class can access outer class static field without the need of referencing the outer class.
 *
 **/
public class Challenge_3 {

    static String marvelHero = "";

    public static void main( String[] args ) throws IOException {
        Logan logan = new Logan();
        //firstly, the new PeterParker() instruction is executed
        new Challenge_3().executeAction(new PeterParker(), logan);
        System.out.println(marvelHero + logan.wolverineCloseCount);
    }

    private void executeAction( Closeable spiderMan, AutoCloseable wolverine ) throws IOException {
        /**
         * As We can see after the code execution of the try block we close the resources automatically
         * and we jump to the catch block only if some exception has been thrown.
         */
        try (spiderMan;wolverine){
                wolverine.close();
        }catch (Exception e){
            marvelHero+= "?";
            spiderMan.close();
        }
    }
    static class Logan implements AutoCloseable{
        public static int wolverineCloseCount=0;

        @Override
        public void close() throws IOException {
          marvelHero +=">";
          wolverineCloseCount++;
          if (wolverineCloseCount >= 1) throw new IOException();
        }
    }
    static class PeterParker  implements Closeable{
        @Override
        public void close() throws IOException {
            marvelHero += "#";
        }
    }
}
