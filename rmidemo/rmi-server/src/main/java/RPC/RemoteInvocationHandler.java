package RPC;

import javax.print.attribute.standard.RequestingUserName;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by zwz on 2018/7/11.
 */
public class RemoteInvocationHandler implements InvocationHandler{
    private String host;
    private int port;

    public RemoteInvocationHandler(String host, int port) {
        this.host = host;
        this.port = port;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        RpcRequest rpcRequest = new RpcRequest();
        //RPC.IRmiHello
        rpcRequest.setClassName(method.getDeclaringClass().getName());
        rpcRequest.setMethodName(method.getName());
        rpcRequest.setParameters(args);
        TcpTranport tcpTranport = new TcpTranport(host,port);
        //tcpTranport.send(rpcRequest);
        return tcpTranport.send(rpcRequest);
    }
}
