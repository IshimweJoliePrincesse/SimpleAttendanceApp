public class Main {
    public static void main(String[] args) {
        
        Student student1 = new Student("Alice", 1);
        Student student2 = new Student("Bob", 2);
        Student student3 = new Student("Charlie", 3);

       
        Course course = new Course("Computer Science");
        course.enrollStudent(student1);
        course.enrollStudent(student2);
        course.enrollStudent(student3);

      
        Attendance attendance = new Attendance(course);

        
        attendance.markAttendance(1, true); 
        attendance.markAttendance(2, false); 
        
        attendance.markAttendance(3, true); 

       
        attendance.displayAttendance();
    }
}
