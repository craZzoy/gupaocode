package patterns.singleton.test;

import patterns.singleton.hungry.Hungry;
import patterns.singleton.lazy.LazyOne;
import patterns.singleton.lazy.LazyTwo;
import patterns.singleton.register.Color;
import patterns.singleton.register.RegisterEnum;
import patterns.singleton.register.RegisterMap;

import java.util.concurrent.CountDownLatch;

/**
 * 线程安全测试
 * Created by zwz on 2018/9/4.
 */
public class ThreadSafeTest {

    public static void main(String[] args) {
        int count = 300;

        //发令枪
        final CountDownLatch latch = new CountDownLatch(count);

        long start = System.currentTimeMillis();

        for(int i = 0; i< count;i++){
            new Thread(){
                @Override
                public void run(){
                    try {
                        latch.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    Object obj = Color.BLACK;
                    System.out.println(obj);
                }
            }.start();

            latch.countDown();

        }

        long end = System.currentTimeMillis();

        System.out.println("总耗时："+(end - start));
    }
}
