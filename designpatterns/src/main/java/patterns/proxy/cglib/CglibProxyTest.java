package patterns.proxy.cglib;

/**
 * Created by zwz on 2018/9/5.
 */
public class CglibProxyTest {
    public static void main(String[] args) {
        try {
            Wangwu wangwu = (Wangwu) new CglibMatchMaker().getInstance(Wangwu.class);

            wangwu.findObject();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
