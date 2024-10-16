package aggregationCompocition;

import java.util.ArrayList;
import java.util.List;

public class Class {
    private List<Student> students;

    public Class(){
        students = new ArrayList<>();
    }


    public void addStudens(Student student) {
        if (student != null) {
            students.add(student);
        }
    }

    public void callList(Student student) {
        if (student != null) {
            System.out.println("call  student list" + student.getName());
            student.markAsistend();
            System.out.println("student is here");
        }
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

}
