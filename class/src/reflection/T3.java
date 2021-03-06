package reflection;

import javax.management.monitor.Monitor;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

//反射获得类的属性
public class T3 {

    public static void printAll(Field[] fields,Object object) throws IllegalAccessException {
        for(Field field:fields){
            System.out.print(Modifier.toString(field.getModifiers()));
            System.out.print(" "+field.getType());
            System.out.print(" "+field.getName());
            //field.setAccessible(true);
            /*if(field.getType().isArray()) {
                for (int i = 0; i < Array.getLength(field.get(object)); i++) {
                    System.out.print(" " + Array.get(field.get(object),i));
                }
                System.out.println();
            }else {*/
                System.out.println(" " + field.get(object));
           // }
        }
    }

    public static void getAllFields() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class c = Class.forName("reflection.Student");
        Field[] fields=c.getFields();
        //Field[] fields=c.getDeclaredFields();
        printAll(fields,c.newInstance());
    }

    public static void main(String args[]) {
        try {
            getAllFields();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
    }
}
