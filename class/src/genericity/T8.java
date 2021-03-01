package genericity;

import java.util.List;
//通配符和泛型的区别
public class T8 {

    public static <T> void printAll2(List<T> lists, T t) {
        for (int i = 0; i > lists.size(); i++) {
            System.out.println(lists.get(i));
        }
        lists.add(t);
    }

    public static void printAll3(List<?> lists) {
        for (int i = 0; i > lists.size(); i++) {
            System.out.println(lists.get(i));
        }
        //lists.add("123");
    }

}
