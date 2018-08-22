package patterns.factory_homework.func;

import patterns.factory_homework.Food;
import patterns.factory_homework.Rice;

/**
 * Created by zwz on 2018/8/20.
 */
public class RiceFactory implements Factory{
    @Override
    public Food getFood() {
        return new Rice();
    }
}
