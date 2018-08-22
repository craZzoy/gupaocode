package patterns.factory_homework.func;

import patterns.factory_homework.Food;

/**
 * Created by zwz on 2018/8/21.
 */
public class FactoryTest {
    public static void main(String[] args) {
        Factory factory = new BreadFactory();
        Food food = factory.getFood();
        System.out.println(food);
    }
}
