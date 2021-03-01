package genericity;

import java.util.ArrayList;
import java.util.List;

//通配符的下限
public class T7 {

    public static class Grandfather {

    }

    public static class Father extends Grandfather {

    }

    public static class Son extends Father {

    }

    public static void test(List<? super Father> lists) {
        System.out.println(lists);
    }

    public static void main(String args[]) {
        List<Son> sonList = new ArrayList<>();
        List<Father> fatherList = new ArrayList<>();
        List<Grandfather> grandfatherList = new ArrayList<>();
        //test(sonList);
        test(fatherList);
        test(grandfatherList);
    }
}
