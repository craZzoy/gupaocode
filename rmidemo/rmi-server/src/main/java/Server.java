import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

/**
 * Created by zwz on 2018/7/8.
 */
public class Server {
    public static void main(String[] args) {
        try{
            //已经发布了一个远程对象
            IHelloService iHelloService = new IHelloServiceImpl();
            LocateRegistry.createRegistry(1099);
            //注册中心 key - value
            Naming.rebind("rmi://127.0.0.1/Hello",iHelloService);
            System.out.println("服务启动成功");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
