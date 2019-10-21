package challenge01_20;

import java.io.Closeable;
import java.io.IOException;

/**
 *  str.matches(regExp) return tru if str matches the given regular expressions.
 *
 *  RuntimeException extends Exception extends Throwable.
 *  StackOverflowError extends Error extends Throwable.
 *
 *  in a try with resources block, when an exception is thrown, the resource is closed before any catch block.
 *
 */
public class Challenge_9  {
    public static void main( String[] args ) {
        String soprano = null;
        CloseIt closeIt = new CloseIt();
        try (closeIt){
            System.out.println(soprano.matches(null));
        }catch (RuntimeException re){
            try (closeIt){
                System.out.println("runtime");
                throw new StackOverflowError();
            }
            catch(Exception e){
                System.out.println("exception");
            }
        }
        catch (Error error){
            System.out.println("error");
        }
        catch (Throwable throwable){
            System.out.println("throwable");
        }
    }

    private static class CloseIt implements Closeable {
        @Override
        public void close() throws IOException {
            System.out.println("close");
        }
    }
}
