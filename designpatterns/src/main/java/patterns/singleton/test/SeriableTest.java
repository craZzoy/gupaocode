package patterns.singleton.test;

import patterns.singleton.seriable.Seriable;

import java.io.*;

/**
 * Created by zwz on 2018/9/4.
 */
public class SeriableTest {
    public static void main(String[] args) {
        Seriable s1 = null;
        Seriable s2 = Seriable.getInsatnce();
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Seriable.obj"));
            oos.writeObject(s2);
            oos.flush();

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Seriable.obj"));
            s1 = (Seriable) ois.readObject();
            ois.close();

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1==s2);
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
