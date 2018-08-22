package patterns.factory_homework.simple;

import patterns.factory_homework.Bread;
import patterns.factory_homework.Food;
import patterns.factory_homework.Meat;
import patterns.factory_homework.Rice;

/**
 * 简单工厂
 * Created by zwz on 2018/8/20.
 */
public class SimpleFactory {
    public Food getFood(String name){
        if("米饭".equals(name)){
            return new Rice();
        }else if("面包".equals(name)){
            return new Bread();
        }else if("肉".equals(name)){
            return new Meat();
        }else{
            System.out.println("我不生产这个");
            return null;
        }
    }
}
