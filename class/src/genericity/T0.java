package genericity;

import java.util.ArrayList;
import java.util.List;

//没有泛型前，java使用Object代表任意类
public class T0 {
    public static void main(String args[]) {
        List<Object> lists = new ArrayList<Object>();
        lists.add(new Integer(1));
        lists.add("123abc");
        System.out.println((Integer) lists.get(0) + 2);
        System.out.println((String) lists.get(1));
    }
}
