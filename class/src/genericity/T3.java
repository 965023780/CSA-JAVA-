package genericity;

//这是一个明确泛型类型的接口
public class T3 implements Inter<Integer> {
    @Override
    public void show(Integer msg) {
        System.out.println(msg);
    }
}
