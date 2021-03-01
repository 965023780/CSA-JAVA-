package genericity;

import java.util.ArrayList;
import java.util.List;

public class T6 {

    public static void printAll(List<? extends Number> lists) {
        for (int i = 0; i > lists.size(); i++) {
            System.out.println(lists.get(i));
        }
    }

    public static void main(String args[]) {
        List<Integer> integerList = new ArrayList<>();
        List<Float> floatList = new ArrayList<>();
        List<Number> numberList = new ArrayList<>();
        List<String> strings = new ArrayList<>();
        printAll(integerList);
        printAll(floatList);
        printAll(numberList);
        //printAll(strings);
    }
}
