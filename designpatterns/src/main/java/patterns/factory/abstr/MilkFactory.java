package patterns.factory.abstr;

import patterns.factory.Aimuxi;
import patterns.factory.Menniu;
import patterns.factory.Milk;
import patterns.factory.Yili;
import patterns.factory.func.AimuxiFactory;
import patterns.factory.func.MenniuFactory;
import patterns.factory.func.YiliFactory;

/**
 * Created by zwz on 2018/8/20.
 */
public class MilkFactory extends AbstractFactory{
    @Override
    Milk getMenniu() {
        return new MenniuFactory().getMilk();
    }

    @Override
    Milk getYili() {
        return new YiliFactory().getMilk();
    }

    @Override
    Milk getAimuxi() {
        return new AimuxiFactory().getMilk();
    }
}
