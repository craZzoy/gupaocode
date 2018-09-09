package patterns.proxy.jdk;


import patterns.proxy.staticed.Person;
import sun.misc.ProxyGenerator;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by zwz on 2018/9/5.
 */
public class JdkMatchMaker implements InvocationHandler{

    private Person target;

    public Object getInstance(Person target){
        this.target = target;
        Class<?> clazz = target.getClass();
        //参数：类加载器、被代理对象实现的接口、Handler类
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是金牌媒婆，帮你找对象，服务好包满意");

        method.invoke(this.target,args);

        System.out.println("找到合适的给个好评啊");

        //System.out.println(proxy);
        return null;
    }
}
