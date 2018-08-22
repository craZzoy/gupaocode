package patterns.factory.func;

/**
 * Created by zwz on 2018/8/20.
 */
public class FactoryTest {
    public static void main(String[] args) {
        Factory factory = new MenniuFactory();
        System.out.println(factory.getMilk());
    }
}
