package patterns.factory_homework.simple;

import patterns.factory_homework.Food;

/**
 * Created by zwz on 2018/8/20.
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        Food food = factory.getFood("米饭");
        System.out.println(food);
    }
}
