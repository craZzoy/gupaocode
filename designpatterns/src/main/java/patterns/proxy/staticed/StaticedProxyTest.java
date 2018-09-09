package patterns.proxy.staticed;

/**
 * Created by zwz on 2018/9/5.
 */
public class StaticedProxyTest {
    public static void main(String[] args) {
        MatchMaker matchMaker = new MatchMaker(new Acmen());

        matchMaker.findObject();
    }
}