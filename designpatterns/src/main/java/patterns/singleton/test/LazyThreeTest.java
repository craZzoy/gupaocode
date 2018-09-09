package patterns.singleton.test;

import patterns.singleton.lazy.LazyThree;

import java.lang.reflect.Constructor;

/**
 * Created by zwz on 2018/9/4.
 */
public class LazyThreeTest {

    public static void main(String[] args) {
        try {
            Class<?> clazz = LazyThree.class;


            //通过反射拿到私有的构造方法
            Constructor c = clazz.getDeclaredConstructor(null);
            //强制访问，强吻
            c.setAccessible(true);

            Object o1 = c.newInstance();
            Object o2 = c.newInstance();
            System.out.println(o1 == o2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
