package patterns.singleton.lazy;

/**
 * 懒汉式单例（线程不安全）
 * Created by zwz on 2018/9/4.
 */
public class LazyOne {

    private LazyOne(){}

    private static LazyOne lazyOne = null;

    public static LazyOne getInstance(){
        if(lazyOne == null){
            //可能多个线程同时进来创建多个对象
            lazyOne = new LazyOne();
        }
        return lazyOne;
    }
}
