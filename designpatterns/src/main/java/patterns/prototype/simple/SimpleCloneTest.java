package patterns.prototype.simple;

import patterns.prototype.Addresss;
import patterns.prototype.Person;

/**
 * Created by zwz on 2018/9/4.
 */
public class SimpleCloneTest {


    public static void main(String[] args) throws CloneNotSupportedException {
        Addresss a1 = new Addresss("深圳");
        Person p1 = new Person("小明",23,a1);

        Person p2 = (Person) p1.clone();

        System.out.println("String 值对比："+(p1.getName() == p2.getName()));

        System.out.println(p1.getAdresss().toString());
        System.out.println(p2.getAdresss().toString());
        System.out.println(p1.getAdresss() == p2.getAdresss());
        System.out.println(p1 == p2);

    }
}
