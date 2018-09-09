package patterns.singleton.hungry;

/**
 * 饿汉式单例
 * Created by zwz on 2018/9/4.
 */
public class Hungry {

    private Hungry(){

    }

    private static final Hungry hungry = new Hungry();

    public static Hungry getInstance(){
        return hungry;
    }
}
