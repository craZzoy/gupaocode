package patterns.factory.func;

import patterns.factory.Milk;
import patterns.factory.Yili;

/**
 * Created by zwz on 2018/8/20.
 */
public class YiliFactory implements Factory {
    @Override
    public Milk getMilk() {
        return new Yili();
    }
}
