package lesson6.Activity62;

public class Student {
    private String name;
    private float gpa;

    public Student(String name, float gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
    public boolean KiemtraDotruot(){
        if (gpa>=1.5f){
            return true;
        }else {
            return false;
        }
    }
    public void print(){
        System.out.println("Tên sinh viên:"+name);
        System.out.println("Điểm GPA:"+gpa);
    }

}
