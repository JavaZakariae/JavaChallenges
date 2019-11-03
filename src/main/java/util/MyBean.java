package util;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *
 */
interface BeanInterface{
    public int calculate ();
}

public class MyBean implements BeanInterface{
    private int value;

    public MyBean( int value ) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue( int value ) {
        this.value = value;
    }
    @Override
    public int calculate (){
        return this.value;
    }

    public static void main( String[] args ) {
        BeanInterface proxyInstance = (BeanInterface) Proxy.newProxyInstance(MyBean.class.getClassLoader(), new Class[]{BeanInterface.class}, new MyHandler());
        proxyInstance.calculate();

    }
}

class MyHandler implements InvocationHandler{

    @Override
    public Object invoke( Object proxy, Method method, Object[] args ) throws Throwable {
        System.out.println("hi");
        return method.invoke(proxy, args);
    }
}
