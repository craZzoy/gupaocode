package patterns.factory.func;

import patterns.factory.Milk;
import patterns.factory.Menniu;

/**
 * Created by zwz on 2018/8/20.
 */
public class MenniuFactory implements Factory{
    @Override
    public Milk getMilk() {
        return new Menniu();
    }
}
