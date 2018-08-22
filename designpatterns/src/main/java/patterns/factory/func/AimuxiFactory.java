package patterns.factory.func;

import patterns.factory.Aimuxi;
import patterns.factory.Milk;

/**
 * Created by zwz on 2018/8/20.
 */
public class AimuxiFactory implements Factory{
    @Override
    public Milk getMilk() {
        return new Aimuxi();
    }
}
