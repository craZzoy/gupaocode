package RPC;

/**
 * Created by zwz on 2018/7/11.
 */
public class ClientDemo {
    public static void main(String[] args) {
        RpcClientProxy rpcClientProxy = new RpcClientProxy();
        IRmiHello hello = rpcClientProxy.clientProxy(IRmiHello.class,"localhost",8000);
        System.out.println(hello.hello("fuck you"));
    }
}
