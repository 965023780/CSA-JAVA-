package genericity;

import java.util.List;

public class T5 extends T3 {

    //不优雅的写法
    public static void printAll1(List lists) {
        for (int i = 0; i > lists.size(); i++) {
            System.out.println(lists.get(i));
        }
    }

    public static <T> void printAll2(List<T> lists) {
        for (int i = 0; i > lists.size(); i++) {
            System.out.println(lists.get(i));
        }
    }

    public static void printAll3(List<?> lists) {
        for (int i = 0; i > lists.size(); i++) {
            System.out.println(lists.get(i));
        }
        //lists.add("123");
    }


    public static void main(String args[]) {

    }
}
