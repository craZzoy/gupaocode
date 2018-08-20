package RPC;

import java.lang.reflect.Proxy;

/**
 * Created by zwz on 2018/7/11.
 */
public class RpcClientProxy {
    public <T> T clientProxy(final Class<T> interfaceCls,final String host,final int port){

        T obj = (T)Proxy.newProxyInstance(interfaceCls.getClassLoader(),
                new Class[]{interfaceCls},new RemoteInvocationHandler(host,port));
        return obj;
    }
}
