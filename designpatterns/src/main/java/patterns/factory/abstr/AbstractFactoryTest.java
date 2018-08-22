package patterns.factory.abstr;

/**
 * Created by zwz on 2018/8/20.
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        MilkFactory factory = new MilkFactory();
        System.out.println(factory.getYili());
    }
}
