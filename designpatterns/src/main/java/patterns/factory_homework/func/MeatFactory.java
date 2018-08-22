package patterns.factory_homework.func;

import patterns.factory_homework.Food;
import patterns.factory_homework.Meat;

/**
 * Created by zwz on 2018/8/20.
 */
public class MeatFactory implements Factory{
    @Override
    public Food getFood() {
        return new Meat();
    }
}
