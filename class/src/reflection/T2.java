package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.rmi.StubNotFoundException;

public class T2 {

    public static void printMethod(Method[] methods) {
        for (Method method : methods) {
            System.out.print(Modifier.toString(method.getModifiers()) + " " + method.getName() + " 参数：");
            Class[] param = method.getParameterTypes();
            for (Class css : param) {
                System.out.print(css.getName() + " ");
            }
            System.out.println();
        }
    }

    public static void getAllMethods() throws ClassNotFoundException {
        Class c = Class.forName("reflection.Student");
        Method[] methods = c.getDeclaredMethods();
        printMethod(methods);
    }

    public static Method getNoParamMethod(String methodName) throws ClassNotFoundException {
        Class c = Class.forName("reflection.Student");
        Method[] method = new Method[1];
        try {
            method[0] = c.getDeclaredMethod(methodName);
            printMethod(method);
            return method[0];
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Method getParamMethod(String methodName, Class[] param) throws ClassNotFoundException {
        Class c = Class.forName("reflection.Student");
        Method[] method = new Method[1];
        try {
            method[0] = c.getDeclaredMethod(methodName, param);
            printMethod(method);
            return method[0];
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String args[]) throws IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException {
        getAllMethods();
        Method[] methods=new Method[2];
        methods[0]=getParamMethod("setName", new Class[]{String.class});
        methods[1]=getNoParamMethod("getName");
        methods[0].setAccessible(true);//调用私有方法都需要这一步
        Class c=Class.forName("reflection.Student");
        Object student=c.newInstance();
        methods[0].invoke(student,"xxxxx");
        System.out.println(methods[1].invoke(student));
    }
}
