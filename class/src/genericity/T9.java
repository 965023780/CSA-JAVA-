package genericity;

import java.util.ArrayList;
//泛型擦除的经典范例
public class T9 {

    public static void main(String args[]) {
        Class c1 = new ArrayList<StringBuffer>().getClass();
        Class c2 = new ArrayList<Integer>().getClass();
        System.out.println(c1 == c2);
        c1 = new Integer(1).getClass();
        c2 = new StringBuffer().getClass();
        System.out.println(c1 == c2);
    }
}
