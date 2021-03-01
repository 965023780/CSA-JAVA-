package genericity;

//这是一个未明确泛型类的接口
public class T4<T> implements Inter<T> {
    //public static T age;
    @Override
    public void show(T msg) {
        System.out.println(msg);
    }

}
