package challenge21_40;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 *  InvocationHandler is the interface implemented by the handler of a proxy class.
 *  Method  the method that has been called
 *  Throwable   is the super class of the exception class
 *
 *  To create a proxy for some interface Tobeproxied
 *   InvocationHandler handler = new MyIvocationHandler(...);
 *   Tobeproxied proxy = Proxy.newProxyInstance(handler.getClassLoader(),
 *                                              Tobeproxied,
 *                                              handler);
 */
public class Challenge_24 implements InvocationHandler {

    private final List proxied;

    public Challenge_24( List proxied ) {this.proxied = proxied;}

    @Override
    public Object invoke( Object proxy, Method method, Object[] args ) throws Throwable {
        if (method.getName().startsWith("remove")){
            return false;
        }
        if (method.getName().startsWith(""+(char)99) || method.getName().startsWith(""+(char)101)){
            return false;
        }
        return method.invoke(proxied, args);
    }


    public static void main( String[] args ) {
        System.out.println(""+(char)99);

        var proxy = (List) Proxy.newProxyInstance(Challenge_24.class.getClassLoader(),
                                            new Class[]{List.class},
                                            new Challenge_24(new ArrayList()));
        proxy.add("Barney");
        proxy.add("Homer");
        proxy.add("Moe");
        proxy.add("Homer");
        proxy.add("Moe");
        proxy.add(proxy.contains("Homer"));
        proxy.add(proxy.equals(proxy));
        System.out.println("proxy = " + proxy);


    }

}
