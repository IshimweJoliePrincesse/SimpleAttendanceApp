
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class Attendance {
    private Course course;
    private Map<Integer, Boolean> attendanceRecord; 

    public Attendance(Course course) {
        this.course = course;
        this.attendanceRecord = new HashMap<>();
    }

    public void markAttendance(int studentId, boolean present) {
        attendanceRecord.put(studentId, present);
    }

    public void displayAttendance() {
        System.out.println("Attendance for course: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            boolean present = attendanceRecord.getOrDefault(student.getId(), false);
            System.out.println(student.getName() + " (ID: " + student.getId() + ") - " + (present ? "Present" : "Absent"));
        }
    }
}