package SortStudentsByGrade;
public class Student {

    protected String name = null;
    protected int grade = 0;
    
    public Student(String name, int grade){
        this.name = name;
        if(grade>1 && grade<7){
        this.grade = grade;
        }
        else this.grade = 2;
    }
}
