package patterns.proxy.staticed;

/**
 * 媒婆，代理码农去找对象
 * Created by zwz on 2018/9/5.
 */
public class MatchMaker {
    private Person person;

    public MatchMaker(Person person){
        this.person = person;
    }

    public void findObject(){
        System.out.println("媒婆帮你找对象");
        this.person.findObject();
        System.out.println("双方决定合不合适");
    }
}
