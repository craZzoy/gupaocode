package RPC;

/**
 * Created by zwz on 2018/7/11.
 */
public class IRmiHelloImpl implements IRmiHello{
    @Override
    public String hello(String msg) {
        return "hello"+msg;
    }
}
