package reflection;
//获取类名
public class T0 {
    public static void main(String args[]){
       Student student=new Student();
        Class c=student.getClass();
        System.out.println(c);

        String className="reflection.Student"; // Student的类名
        try {
            System.out.println(Class.forName(className));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
