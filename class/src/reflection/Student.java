package reflection;
//被反射的类
public class Student {

    public String name="test";
    public String friendsName[]= new String[]{"a","b","c","d"};
    public boolean gender=false;
    private int age=Integer.MAX_VALUE;
    private double score=Double.MIN_VALUE;

    public Student(){}
    private Student(String name,boolean gender){
        this.name=name;
        this.gender=gender;
    }

    public String getName() {
        return name;
    }

    public boolean getGender(){
        return gender;
    }

    public int getAge() {
        return age;
    }

    public double getScore() {
        return score;
    }

    private void setGender(boolean gender) {
        this.gender = gender;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setScore(double score) {
        this.score = score;
    }

}
