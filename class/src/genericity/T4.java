package genericity;

public class T4<T> implements Inter<T> {
    //public static T age;
    @Override
    public void show(T msg) {
        System.out.println(msg);
    }

}
