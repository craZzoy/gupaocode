import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by zwz on 2018/7/8.
 */
public class IHelloServiceImpl extends UnicastRemoteObject implements IHelloService{
    protected IHelloServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public String sayHello(String msg) throws RemoteException {
        return "hello"+msg;
    }
}
