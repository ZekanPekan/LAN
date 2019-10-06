import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

public class TestMain {

    public List<String> t;

    public TestMain(){
        t = Lists.newArrayList();
        t.add("neca");
        t.add("peca");
    }

    public static void main(String[] args) {
        TestMain tm = new TestMain();
        System.out.println(tm.t);
    }

}
