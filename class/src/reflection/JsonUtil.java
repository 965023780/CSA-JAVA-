package reflection;

import java.lang.reflect.Field;

public class JsonUtil {

    public static <T> StringBuffer ObjectToJson(T t){
        Class<?> c=t.getClass();
        Field[] fields=c.getDeclaredFields();
        StringBuffer sb=new StringBuffer("{");
        for(Field field:fields){
            field.setAccessible(true);
            if(sb.equals("{")){
                sb.append(",");
            }
            sb.append("\n"+"\""+field.getName()+"\":");
            try {
                sb.append(field.get(t));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        sb.append("\n}");
        return sb;
    }

    public static void main(String args[]){
        Student student=new Student();
        StringBuffer sb=ObjectToJson(student);
        System.out.print(sb.toString());
    }
}
