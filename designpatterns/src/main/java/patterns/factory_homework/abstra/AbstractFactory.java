package patterns.factory_homework.abstra;

import patterns.factory_homework.Food;

/**
 * Created by zwz on 2018/8/21.
 */
public abstract class AbstractFactory {

    abstract Food getMeat();

    abstract Food getRice();

    abstract Food getBread();
}
