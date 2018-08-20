package RPC;

/**
 * Created by zwz on 2018/7/11.
 */
public class ServerDemo {
    public static void main(String[] args) {
        IRmiHello iRmiHello = new IRmiHelloImpl();
        RpcServer rpcServer = new RpcServer();
        rpcServer.publisher(iRmiHello,8000);
    }
}
