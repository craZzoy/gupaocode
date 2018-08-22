package patterns.factory_homework.abstra;

import patterns.factory_homework.Bread;
import patterns.factory_homework.Food;
import patterns.factory_homework.Meat;
import patterns.factory_homework.Rice;
import patterns.factory_homework.func.BreadFactory;
import patterns.factory_homework.func.MeatFactory;
import patterns.factory_homework.func.RiceFactory;

/**
 * Created by zwz on 2018/8/21.
 */
public class FoodFactory extends AbstractFactory{
    @Override
    Food getMeat() {
        return new MeatFactory().getFood();
    }

    @Override
    Food getRice() {
        return new RiceFactory().getFood();
    }

    @Override
    Food getBread() {
        return new BreadFactory().getFood();
    }
}
