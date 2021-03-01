package genericity;

public class T3 implements Inter<Integer> {
    @Override
    public void show(Integer msg) {
        System.out.println(msg);
    }
}
