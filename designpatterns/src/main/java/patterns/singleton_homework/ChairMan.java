package patterns.singleton_homework;

import javax.swing.text.AsyncBoxView;

/**
 * 单例模式作业，主席
 * Created by zwz on 2018/9/4.
 */
public class ChairMan {
    private ChairMan(){}

    public static final ChairMan getInstance(){
        return ChairManHolder.INVIOCE;
    }

    private static final class ChairManHolder{
        private static final ChairMan INVIOCE = new ChairMan();
    }
}
