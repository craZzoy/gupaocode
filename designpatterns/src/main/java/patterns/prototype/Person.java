package patterns.prototype;

import java.io.*;

/**
 * Created by zwz on 2018/9/4.
 */
public class Person implements Cloneable,Serializable{
    private String name;
    private int age;
    private Addresss adresss;

    public Person(){}

    public Person(String name, int age, Addresss adresss) {
        this.name = name;
        this.age = age;
        this.adresss = adresss;
    }

    /**
     * 浅克隆
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Addresss getAdresss() {
        return adresss;
    }

    public void setAdresss(Addresss adresss) {
        this.adresss = adresss;
    }

    /**
     * 系列化实现深克隆
     * @return
     */
    public Person deepClone(){
        try {
            ByteArrayOutputStream bo = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bo);
            oos.writeObject(this);

            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bo.toByteArray()));
            return (Person) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
