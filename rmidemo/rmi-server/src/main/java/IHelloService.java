import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by zwz on 2018/7/8.
 */
public interface IHelloService extends Remote{
    String sayHello(String msg)throws RemoteException;
}
