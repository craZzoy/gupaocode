package patterns.singleton.lazy;

/**
 * 懒汉式单例（线程安全）
 * 虽然synchronized能保证线程安全，但效率较低
 * Created by zwz on 2018/9/4.
 */
public class LazyTwo {

    private LazyTwo(){
        if (lazyOne != null){
            throw new RuntimeException("单例被侵犯");
        }
    }

    private static LazyTwo lazyOne = null;

    public synchronized static LazyTwo getInstance(){
        if(lazyOne == null){
            lazyOne = new LazyTwo();
        }
        return lazyOne;
    }
}
