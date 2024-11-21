

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class Course {
    private String courseName;
    private List<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public void enrollStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public String getCourseName() {
        return courseName;
    }
}