package patterns.factory_homework.func;

import patterns.factory_homework.Bread;
import patterns.factory_homework.Food;

/**
 * Created by zwz on 2018/8/21.
 */
public class BreadFactory implements Factory{
    @Override
    public Food getFood() {
        return new Bread();
    }
}
