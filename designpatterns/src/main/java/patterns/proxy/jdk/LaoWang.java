package patterns.proxy.jdk;

import patterns.proxy.staticed.Person;

/**
 * jdk动态代理原理（即字节码重组）：
 * 1、拿到被代理对象的引用，并且获取它实现的所有接口，反射获取
 * 2、Jdk Proxy类重新生成一个类，同时新的类要实现被代理类实现的所有接口
 * 3、动态生成Java代码，把新加的业务逻辑方法由一定的逻辑代码调用
 * 4、编译生成.class文件
 * 5、把类重新加载到JVM中运行
 * Created by zwz on 2018/9/5.
 */
public class LaoWang implements Person{
    @Override
    public void findObject() {
        System.out.println("老王是高富帅，身高180，有8块腹肌");
    }

    @Override
    public void findJob() {
        System.out.println("活少钱多离家近");
    }

    @Override
    public void rentHouse() {
        System.out.println("要海景别墅");
    }
}
