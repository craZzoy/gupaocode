package patterns.factory.abstr;

import patterns.factory.Milk;

/**
 * 抽象工厂
 * spring中用的最为广泛的一种设计模式
 * 为什么不使用接口：抽象类可以存储一些公共的逻辑，方便统一管理，易于拓展
 * Created by zwz on 2018/8/20.
 */
public abstract class AbstractFactory {

    //这些是公共的逻辑，便于管理

    abstract Milk getMenniu();

    abstract Milk getYili();

    abstract Milk getAimuxi();

}
