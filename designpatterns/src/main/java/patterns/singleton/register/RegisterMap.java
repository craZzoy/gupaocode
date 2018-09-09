package patterns.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 注册式单例，Spring中运用最多
 * Created by zwz on 2018/9/4.
 */
public class RegisterMap {

    private static Map<String,Object> registor = new ConcurrentHashMap<String, Object>();

    private RegisterMap(){}

    public synchronized static RegisterMap getInstance(String name){
        if(name==null){
            name = RegisterMap.class.getName();
        }

        if(registor.get(name) == null){
            registor.put(name,new RegisterMap());
        }

        return (RegisterMap)registor.get(name);

    }
}
