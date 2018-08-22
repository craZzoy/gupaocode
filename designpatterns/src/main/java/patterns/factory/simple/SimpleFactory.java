package patterns.factory.simple;

import patterns.factory.Aimuxi;
import patterns.factory.Milk;
import patterns.factory.Menniu;
import patterns.factory.Yili;

/**
 * 简单工厂（小作坊式）
 * Created by zwz on 2018/8/20.
 */
public class SimpleFactory {
    public Milk getMilk(String name){
        if("爱慕希".equals(name)){
            return new Aimuxi();
        }else if("蒙牛".equals(name)){
            return new Menniu();
        }else if("伊利".equals(name)){
            return new Yili();
        }else{
            System.out.println("不能生产你所需的产品");
            return null;
        }
    }
}
