package patterns.factory.simple;

import patterns.factory.Milk;

/**
 * Created by zwz on 2018/8/20.
 */
public class Test {
    public static void main(String[] args) {
        //工厂的核心思想就是用户不用关系产品的生产过程，直接去获取
        SimpleFactory factory = new SimpleFactory();
        Milk milk = factory.getMilk("爱慕希");
        System.out.println(milk);
    }
}
