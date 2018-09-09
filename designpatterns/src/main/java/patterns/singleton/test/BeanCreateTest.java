package patterns.singleton.test;

import patterns.singleton.lazy.LazyOne;
import patterns.singleton.lazy.LazyThree;
import patterns.singleton.lazy.LazyTwo;

/**
 * Created by zwz on 2018/9/4.
 */
public class BeanCreateTest {

    public static void main(String[] args) {
        int count = 20000000;
        long start = System.currentTimeMillis();
        for(int i = 0;i<count;i++){
            Object obj = LazyThree.getInstance();
        }
        long end = System.currentTimeMillis();
        System.out.println("总耗时"+(end - start));
    }
}
