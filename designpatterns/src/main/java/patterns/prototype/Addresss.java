package patterns.prototype;

import java.io.Serializable;

/**
 * Created by zwz on 2018/9/4.
 */
public class Addresss implements Serializable{
    public Addresss(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public String toString() {
        return "Addresss{" +
                "name='" + name + '\'' +
                '}';
    }
}
