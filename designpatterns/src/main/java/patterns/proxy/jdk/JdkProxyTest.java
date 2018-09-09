package patterns.proxy.jdk;

import patterns.proxy.staticed.Person;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by zwz on 2018/9/5.
 */
public class JdkProxyTest {
    public static void main(String[] args) {
        //获取代理对象
        Person person = (Person) new JdkMatchMaker().getInstance(new LaoWang());
        System.out.println(person.getClass());
        //代理帮忙找对象
        person.findObject();


        //通过反编译查看源码
        try {
            byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class});
            FileOutputStream os = new FileOutputStream("E://$Proxy0.class");
            os.write(bytes);
            os.flush();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
