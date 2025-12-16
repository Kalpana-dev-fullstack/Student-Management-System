import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    private List<Student> students = new ArrayList<>();

    // Add student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully");
    }

    // View all students
    public void viewStudents() {
        for (Student s : students) {
            System.out.println(s);
        }
    }

    // Delete student by ID
    public void deleteStudent(int id) {
        students.removeIf(student -> student.getId() == id);
        System.out.println("Student deleted successfully");
    }
}
