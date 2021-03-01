package genericity;

public class T1<T> {
    T bean;

    public T getBean() {
        return bean;
    }

    public void setBean(T bean) {
        this.bean = bean;
    }

    public static void main(String args[]) {
        T1<Integer> t = new T1<>();
        t.setBean(2);
        //t.setBean("123");
        System.out.println(t.getBean());
        T1<T1<Integer>> t1 = new T1<>();
        t1.setBean(t);
        System.out.println(t);
        System.out.println(t1.getBean());
    }
}
