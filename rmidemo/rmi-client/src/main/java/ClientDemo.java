import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Created by zwz on 2018/7/8.
 */
public class ClientDemo {
    public static void main(String[] args) throws RemoteException,NotBoundException,MalformedURLException {
        IHelloService iHelloService = (IHelloService)Naming.lookup("rmi://127.0.0.1/Hello");
        System.out.println(iHelloService.sayHello("bitch"));
    }
}
