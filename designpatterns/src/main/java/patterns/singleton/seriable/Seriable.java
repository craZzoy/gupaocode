package patterns.singleton.seriable;

import java.io.ObjectInputStream;
import java.io.Serializable;

/**
 * Created by zwz on 2018/9/4.
 */
public class Seriable implements Serializable{

    public  final static Seriable INSATNCE = new Seriable();

    private Seriable(){}

    public static Seriable getInsatnce(){
        return INSATNCE;
    }

    private Object readResolve(){
        return INSATNCE;
    }
}
