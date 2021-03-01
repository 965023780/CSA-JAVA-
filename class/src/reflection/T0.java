package reflection;

public class T0 {
    public static void main(String args[]){
       Student student=new Student();
        Class c=student.getClass();
        System.out.println(c);

        String className="reflection.Student"; // String的类名
        try {
            System.out.println(Class.forName(className));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
