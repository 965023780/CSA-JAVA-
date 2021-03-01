package genericity;

import java.lang.reflect.ParameterizedType;

//这是一个泛型方法
public class T2 {

    public static <T> void show(T msg) {
        System.out.println(msg);
    }

    public <T> T getNewOne(T oldOne) throws IllegalAccessException, InstantiationException {
        ParameterizedType superClass = (ParameterizedType) getClass().getGenericSuperclass();
        Class<T> type = (Class<T>) superClass.getActualTypeArguments()[0];
        T newOne = type.newInstance();
        return newOne;
    }

    public static void main(String args[]) {
        show(123);
        show("123anc");
        show(new Integer(1));
        //Integer integer=new Integer(2);
        //System.out.println(integer);
        // try {
        //    System.out.println(getNewOne(integer));
        // } catch (IllegalAccessException e) {
        //     e.printStackTrace();
        // } catch (InstantiationException e) {
        //     e.printStackTrace();
        //  }
    }
}
