package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.rmi.StubNotFoundException;

public class T1 {

    public static void printConstructor(Constructor[] constructors){
        for(Constructor constructor:constructors){
            System.out.print(Modifier.toString(constructor.getModifiers())+" 参数：");
            Class[] param=constructor.getParameterTypes();
            for(Class css:param){
                System.out.print(css.getName()+" ");
            }
            System.out.println();
        }
    }

    public static void getAllConstructors() throws ClassNotFoundException {
        Class c=Class.forName("reflection.Student");
        Constructor[] constructors=c.getDeclaredConstructors();
        printConstructor(constructors);
    }

    public static Constructor getNoParamConstructor() throws ClassNotFoundException {
        Class c=Class.forName("reflection.Student");
        Constructor[] constructor=new Constructor[1];
        try {
            constructor[0]=c.getDeclaredConstructor();
            printConstructor(constructor);
            return constructor[0];
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Constructor getParamConstructor() throws ClassNotFoundException {
        Class c=Class.forName("reflection.Student");
        Class[] param={String.class,boolean.class};
        Constructor[] constructor=new Constructor[1];
        try {
            constructor[0]=c.getDeclaredConstructor(param);
            printConstructor(constructor);
            return constructor[0];
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String args[]) throws IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException {
       getAllConstructors();
       getParamConstructor();
       getNoParamConstructor();

       Constructor constructor=getParamConstructor();
       constructor.setAccessible(true);//调用私有方法都需要这一步
       Student student= (Student) constructor.newInstance("cqupt",true);
       System.out.println(student.gender+" "+student.name);
    }
}
